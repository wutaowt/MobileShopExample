/*
Navicat MySQL Data Transfer

Source Server         : localhost_root
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mobile_shop

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-04-09 19:54:59
*/

drop database if exists mobile_shop ;

create database  mobile_shop;

use mobile_shop;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ms_member
-- ----------------------------
DROP TABLE IF EXISTS `ms_member`;
CREATE TABLE `ms_member` (
  `member_id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `sex` varchar(6) DEFAULT NULL,
  `mobile` varchar(50) DEFAULT NULL,
  `regtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lastlogin` timestamp NULL DEFAULT '0000-00-00 00:00:00',
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ms_member
-- ----------------------------
INSERT INTO `ms_member` VALUES ('2', '李四', '123456', 'ls@qq.com', '0', '13338875863', '2019-04-05 12:14:50', '2019-04-05 12:14:45', null);

-- ----------------------------
-- Table structure for ms_member_address
-- ----------------------------
DROP TABLE IF EXISTS `ms_member_address`;
CREATE TABLE `ms_member_address` (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `member_id` int(11) NOT NULL,
  `province` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `region` varchar(50) DEFAULT NULL,
  `addr` text,
  `mobile` varchar(50) NOT NULL,
  `receiver` varchar(50) NOT NULL,
  `creatime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modifytime` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`address_id`),
  KEY `FK_Reference_1` (`member_id`),
  CONSTRAINT `FK_Reference_1` FOREIGN KEY (`member_id`) REFERENCES `ms_member` (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ms_member_address
-- ----------------------------
INSERT INTO `ms_member_address` VALUES ('2', '2', '广东省', '深圳市', '南山区', '西丽', '13971986543', '李素素', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
INSERT INTO `ms_member_address` VALUES ('3', '2', '广东省', '深圳市', '南山区', '西丽', '13976543198', '李诗诗', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
INSERT INTO `ms_member_address` VALUES ('4', '2', '黑龙江省', '哈尔滨市', '南岗区', '南岗', '13576319854', '李思思', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
INSERT INTO `ms_member_address` VALUES ('5', '2', '广东省', '深圳市', '罗湖区', '罗湖体育馆', '13598763154', '张丽丽', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
INSERT INTO `ms_member_address` VALUES ('6', '2', '黑龙江省', '哈尔滨市', '道里区', '和平路', '13971986543', '李素素', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
INSERT INTO `ms_member_address` VALUES ('7', '2', '黑龙江省', '哈尔滨市', '道里区', '和平路', '13598763154', '张丽丽', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
INSERT INTO `ms_member_address` VALUES ('8', '2', '湖北省', '武汉市', '武昌区', '武昌', '13578963154', '张丹丹', '2019-04-05 12:27:32', '2019-04-05 12:27:32');
