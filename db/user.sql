/*
Navicat MySQL Data Transfer

Source Server         : LMySQL
Source Server Version : 50636
Source Host           : localhost:3306
Source Database       : user-db001

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2019-04-14 16:13:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `db_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '吉多·范罗苏姆', 'GuidovanRossum', '123456', '100', '男', 'database-001');
INSERT INTO `user` VALUES ('2', '肯·汤普逊', 'KenThompson', '123456', '100', '男', 'database-001');
INSERT INTO `user` VALUES ('3', '埃达·洛夫莱斯', 'AdaLovelace', '123456', '100', '女', 'database-001');
INSERT INTO `user` VALUES ('4', '尼克劳斯·维尔特', 'NiklausWirth', '123456', '100', '男', 'database-001');
INSERT INTO `user` VALUES ('5', '比尔·盖茨', 'BillGates', '123456', '100', '男', 'database-001');
INSERT INTO `user` VALUES ('6', '詹姆斯·高斯林', 'JamesGosling', '123456', '100', '男', 'database-001');
