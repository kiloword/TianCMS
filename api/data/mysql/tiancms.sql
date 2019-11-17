SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长主键',
  `username` varchar(255) DEFAULT NULL COMMENT '管理员账号',
  `password` varchar(255) NOT NULL COMMENT '管理员密码',
  `password_salt` varchar(128) NOT NULL COMMENT '加密密钥',
  `icon` varchar(500) DEFAULT NULL COMMENT '头像',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `mobile` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `note` varchar(500) DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `last_login_time` datetime DEFAULT NULL COMMENT '最后登录时间',
  `count_of_login` int(11) DEFAULT NULL COMMENT '登录次数',
  `count_of_failed_login` int(11) DEFAULT NULL COMMENT '连续登录失败次数',
  `creator_name` varchar(255) DEFAULT NULL COMMENT '管理员创建者',
  `locked_out` tinyint(1) DEFAULT '0' COMMENT '账号是否被锁定',
  `department_id` bigint(20) DEFAULT NULL COMMENT '所属部门id，对应department表的id字段',
  `area_id` bigint(20) DEFAULT NULL COMMENT '所在区域id，对应area表的id字段',
  `site_id_set` varchar(50) DEFAULT NULL COMMENT '拥有管理权限的站点Id列表\n',
  `site_id` bigint(20) DEFAULT NULL COMMENT '最后一次管理的站点Id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `idx_administrator_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表，存储管理员信息';

