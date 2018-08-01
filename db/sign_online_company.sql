/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.1.136
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : 192.168.1.136:3306
 Source Schema         : sign_online_company

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 01/08/2018 19:59:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(128) COLLATE utf8_bin DEFAULT NULL COMMENT '企业名称',
  `manager` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '管理员姓名',
  `managerEmail` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '管理员邮箱，该邮箱必须在User表中唯一',
  `managerPhone` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '管理员号码',
  `servicesPhone` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '客服电话',
  `industry` varchar(45) COLLATE utf8_bin DEFAULT NULL COMMENT '所属行业',
  `creatAt` datetime DEFAULT NULL,
  `type` tinyint(4) DEFAULT '0' COMMENT '0表示未认证 1表示认证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of company
-- ----------------------------
BEGIN;
INSERT INTO `company` VALUES (1, '集团总公司', '李国辉', 'ligh1@huluwa.cc', '17611123123', NULL, '消费品', '2018-07-02 03:44:38', 1);
INSERT INTO `company` VALUES (2, '长春子公司', '好笑用', '1324426723@qq', '17767146460', NULL, '互联网／游戏／软件', '2018-06-29 01:47:54', 0);
INSERT INTO `company` VALUES (3, '吉林子公司', '哈哈', 'thm133@foxmail.com', '15156436666', NULL, '金融', '2018-06-29 01:48:50', 1);
INSERT INTO `company` VALUES (4, '平川子公司', '好笑用', 'chenhansheng@huluwa.cc', '17355309570', NULL, '互联网／游戏／软件', '2018-06-29 06:13:01', 1);
COMMIT;

-- ----------------------------
-- Table structure for company_dept
-- ----------------------------
DROP TABLE IF EXISTS `company_dept`;
CREATE TABLE `company_dept` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `deptId` bigint(20) DEFAULT NULL COMMENT '部门id',
  `compId` bigint(20) DEFAULT NULL COMMENT '所属公司id',
  `parentCompId` bigint(20) DEFAULT NULL COMMENT '父公司id',
  PRIMARY KEY (`id`),
  KEY `deptId` (`deptId`),
  KEY `compId` (`compId`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company_dept
-- ----------------------------
BEGIN;
INSERT INTO `company_dept` VALUES (1, 1, 2, 1);
INSERT INTO `company_dept` VALUES (2, 2, 2, 1);
INSERT INTO `company_dept` VALUES (3, 3, 2, 1);
INSERT INTO `company_dept` VALUES (4, 4, 2, 1);
INSERT INTO `company_dept` VALUES (5, 1, 3, 1);
INSERT INTO `company_dept` VALUES (6, 2, 3, 1);
INSERT INTO `company_dept` VALUES (7, 3, 3, 1);
INSERT INTO `company_dept` VALUES (8, 4, 3, 1);
INSERT INTO `company_dept` VALUES (9, 1, 4, 1);
INSERT INTO `company_dept` VALUES (10, 2, 4, 1);
INSERT INTO `company_dept` VALUES (11, 3, 4, 1);
INSERT INTO `company_dept` VALUES (12, 4, 4, 1);
COMMIT;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `name` varchar(128) DEFAULT NULL COMMENT '部门名称',
  `manager` varchar(45) DEFAULT NULL COMMENT '管理员姓名',
  `managerEmail` varchar(45) DEFAULT NULL COMMENT '管理员邮箱，该邮箱必须在User表中唯一',
  `managerPhone` varchar(45) DEFAULT NULL COMMENT '管理员号码',
  `servicesPhone` varchar(45) DEFAULT NULL COMMENT '客服电话',
  `remark` varchar(45) DEFAULT NULL COMMENT '备注',
  `creatAt` datetime DEFAULT NULL,
  `type` tinyint(4) DEFAULT NULL COMMENT '0表示未认证 1表示认证',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
BEGIN;
INSERT INTO `dept` VALUES (1, '企划部', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dept` VALUES (2, '技术部', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dept` VALUES (3, '人事部', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `dept` VALUES (4, '财务部', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
