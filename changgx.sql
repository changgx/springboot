/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : changgx

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2016-11-09 16:36:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `book`
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `ISDN` int(11) NOT NULL,
  `bookName` varchar(32) NOT NULL,
  `price` int(11) NOT NULL,
  `num` int(11) NOT NULL,
  PRIMARY KEY  (`ISDN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', 'JAVA基础', '30', '4');
INSERT INTO `book` VALUES ('2', 'SpringMVC入门', '50', '10');
INSERT INTO `book` VALUES ('3', '测试', '18', '2');
INSERT INTO `book` VALUES ('4', 'springboot', '30', '22');
INSERT INTO `book` VALUES ('5', 'springcloud', '33', '20');
