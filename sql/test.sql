/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : utf-8

 Date: 11/08/2019 01:01:03 AM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `className` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `teacherName` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `weigh` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `course`
-- ----------------------------
BEGIN;
INSERT INTO `course` VALUES ('1', '课题1', '小明', '1'), ('2', '课题2', '小明', '2'), ('3', '课题3', '小明', '3'), ('4', '课题4', '小明', '4'), ('5', '课题5', '小明', '5'), ('6', '课题6', '小明', '6'), ('7', '课题7', '小明', '7'), ('8', '课题8', '小明', '8'), ('9', '课题9', '小明', '9'), ('10', '课题10', '小明', '10'), ('11', '课题11', '小明', '11'), ('12', '课题12', '小明', '12');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
