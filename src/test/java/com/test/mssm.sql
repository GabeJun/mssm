/*
Navicat MySQL Data Transfer

Source Server         : zc-union-test-227
Source Server Version : 50539
Source Host           : 192.168.2.227:3306
Source Database       : mssm

Target Server Type    : MYSQL
Target Server Version : 50539
File Encoding         : 65001

Date: 2016-09-28 09:50:57
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for common_user
-- ----------------------------
DROP TABLE IF EXISTS `common_user`;
CREATE TABLE `common_user` (
  `USER_ID` bigint(65) NOT NULL,
  `LOGIN_NAME` varchar(50) DEFAULT NULL,
  `LOGIN_PASSWORD` varchar(100) DEFAULT NULL,
  `USER_NICKNAME` varchar(100) DEFAULT NULL COMMENT '客户昵称',
  `USER_NAME` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `EMAIL` varchar(100) DEFAULT NULL COMMENT '注册邮箱',
  `ANSWER` varchar(50) DEFAULT NULL,
  `QUESTION` varchar(50) DEFAULT NULL,
  `SEX` int(65) DEFAULT NULL COMMENT '1为男，2为女',
  `BIRTHDAY` date DEFAULT NULL,
  `USER_MONEY` decimal(10,2) DEFAULT NULL,
  `FROZEN_MONEY` decimal(10,2) DEFAULT NULL,
  `PAY_POINTS` decimal(10,2) DEFAULT NULL,
  `USER_LEVEL` int(11) DEFAULT NULL COMMENT '会员等级:0非会员  1vip 2黄金VIP  3白金vip 4 牛逼vip',
  `STATE` int(11) DEFAULT '1' COMMENT '0为锁定，1为有效，空为未激活',
  `MOBILE` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `PHONE` varchar(20) DEFAULT NULL COMMENT '固定电话',
  `USER_ADDRESS` varchar(200) DEFAULT NULL COMMENT '通信地址',
  `POST_CODE` varchar(20) DEFAULT NULL COMMENT '邮编',
  `PIC_URL` varchar(100) DEFAULT NULL COMMENT '客户头像',
  `LOCATION` varchar(20) DEFAULT NULL,
  `LAST_IP` varchar(20) DEFAULT NULL,
  `PARENT_ID` varchar(65) DEFAULT NULL,
  `PARENT_NAME` varchar(20) DEFAULT NULL,
  `LOGIN_AMOUNT` int(11) DEFAULT NULL,
  `FAILTURE_AMOUNT` int(11) DEFAULT '0' COMMENT '登录失败次',
  `CREATE_DATE` date DEFAULT NULL,
  `UPDATE_DATE` date DEFAULT NULL COMMENT '最后一次修改密码时间',
  `LOGIN_DATE` date DEFAULT NULL COMMENT '最后一次登录时间',
  `LOGIN_ERROR_DATE` date DEFAULT NULL COMMENT '最后一次登录失败时间',
  `CREATE_USER` varchar(50) DEFAULT NULL,
  `UPDATE_USER` varchar(50) DEFAULT NULL,
  `FROZEN_POINTS` decimal(10,2) DEFAULT NULL,
  `TRUE_PIC` varchar(50) DEFAULT NULL,
  `YIBAO_ACCOUNT` varchar(32) DEFAULT NULL,
  `YIBAO_ACCOUNT_INNER` varchar(100) DEFAULT NULL,
  `YIBAO_PWD` varchar(50) DEFAULT NULL,
  `ID_CARD` varchar(20) DEFAULT NULL,
  `PERSON_ID` varchar(50) DEFAULT NULL,
  `PERSON_NAME` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `IDX_EMAIL` (`EMAIL`) USING BTREE,
  UNIQUE KEY `IDX_LOGIN_NAME` (`LOGIN_NAME`) USING BTREE,
  KEY `STATUS` (`STATE`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of common_user
-- ----------------------------
INSERT INTO `common_user` VALUES ('1', 'test', '111', 'test', 'test', 'tst@163.com', '', null, null, null, null, null, null, null, '1', null, null, null, null, null, null, null, null, null, null, '0', null, null, null, null, null, null, null, null, null, null, null, null, null, null);
