-- 创建数据库
DROP DATABASE  `BS_BSO`;
CREATE DATABASE IF NOT EXISTS `BS_BSO` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `BS_BSO`;
-- 用户实体
DROP TABLE IF EXISTS `USER`;
CREATE TABLE IF NOT EXISTS `USER`
(
  ID      INT         NOT NULL AUTO_INCREMENT PRIMARY KEY
  COMMENT 'ID主键',

  E_CODE   INT         NOT NULL
  COMMENT '员工号',

  ACCOUNT VARCHAR(20) NOT NULL
  COMMENT '账号',

  PASSWD  VARCHAR(32) NOT NULL
  COMMENT '密码',

  STATUS  CHAR        NOT NULL DEFAULT '0'
  COMMENT '状态:0未启用，1启用，2停用，3删除'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户';

-- 部门实体
DROP TABLE IF EXISTS `DEPARTMENT`;
CREATE TABLE IF NOT EXISTS `DEPARTMENT`
(
  ID             INT         NOT NULL AUTO_INCREMENT PRIMARY KEY
  COMMENT 'ID主键',

  CODE           INT         NOT NULL
  COMMENT '部门编号',

  P_ID            INT         NOT NULL
  COMMENT '上级部门',

  M_ID            INT         NOT NULL
  COMMENT '部门主管',

  TEL_PHONE       VARCHAR(32) NOT NULL
  COMMENT '部门电话',

  OPERATINGCOSTS FLOAT       NOT NULL DEFAULT 0.00
  COMMENT '每个月的部门运营费用'
)ENGINE=InnoDB DEFAULT  CHARSET=utf8 COMMENT='部门';

-- 员工实体
DROP TABLE IF EXISTS `EMPLOYEE`;
CREATE TABLE IF NOT EXISTS `EMPLOYEE`
(
  ID         INT         NOT NULL  AUTO_INCREMENT PRIMARY KEY
  COMMENT 'ID主键',

  E_CODE      INT         NOT NULL
  COMMENT '员工编号',

  NAME       VARCHAR(20)         NOT NULL
  COMMENT '名称',

  AGE        INT         NOT NULL
  COMMENT '年龄',

  SEX        CHAR(1)    NOT NULL
  COMMENT '性别',

  SALARY     FLOAT       NOT NULL  DEFAULT 0.00
  COMMENT '工资',

  JOB_ID      INT         NOT NULL
  COMMENT '职位',

  PHONE_NUM   VARCHAR(15) NOT NULL
  COMMENT '手机号码',

  CREATE_TIME DATETIME    NOT NULL  DEFAULT NOW()
  COMMENT '创建时间',

  UPDATE_TIME DATETIME    NOT NULL  DEFAULT NOW()
  COMMENT '更新时间'
)ENGINE=InnoDB DEFAULT  CHARSET=utf8 COMMENT='员工';
