package com.richy.consumer.config;

import java.util.List;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;

/**
 * @descr：自定义负载均衡算法，每台被调用5次
 * @author： Richy
 * @time：下午3:58:41
 */
public class FiveEveryServiceRule extends AbstractLoadBalancerRule{

	//总共被调用的次数，目前每台机器要求被调用5次
	private int total = 0;
	//当前服务提供的机器号
	private int currentIndex = 0;
	
	public Server choose(ILoadBalancer lb,Object key) {
		if(null == lb) {
			return null;
		}
		Server server = null;
		while(server == null) {
			if(Thread.interrupted()) {
				return null;
			}
			List<Server> upList = lb.getReachableServers();
			List<Server> alList = lb.getAllServers();
			
			int serverCount = alList.size();
			if(serverCount == 0) {
				return null;
			}
			if(total < 5) {
				server = upList.get(currentIndex);
				total++;
			}else {
				total = 0;
				currentIndex++;
				if(currentIndex >= upList.size()) {
					currentIndex = 0;
				}
			}
			if(server == null) {
				Thread.yield();
				continue;
			}
			if(server.isAlive()) {
				return (server);
			}
		}
		return server;
	}
	
	
	@Override
	public Server choose(Object key) {
		return choose(getLoadBalancer(), key);
	}

	@Override
	public void initWithNiwsConfig(IClientConfig clientConfig) {
		// TODO Auto-generated method stub
		
	}

}
