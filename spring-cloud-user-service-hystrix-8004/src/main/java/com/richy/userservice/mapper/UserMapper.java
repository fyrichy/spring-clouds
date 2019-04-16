package com.richy.userservice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.richy.userservice.pojo.User;

@Mapper
public interface UserMapper {

	List<User> findList();

	User findById(@Param("id") Integer id);
	
}
