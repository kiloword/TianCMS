SET FOREIGN_KEY_CHECKS=0;

DROP TABLE IF EXISTS `administrator`;
CREATE TABLE `administrator` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增长主键',
  `username` varchar(255) COMMENT '管理员账号',
  `password` varchar(255) NOT NULL COMMENT '管理员密码',
  `password_salt` varchar(128) NOT NULL COMMENT '加密密钥',
  `icon` varchar(500) COMMENT '头像',
  `email` varchar(100) COMMENT '邮箱',
  `mobile` varchar(20) COMMENT '手机号码',
  `nickname` varchar(255) COMMENT '昵称',
  `note` varchar(500) COMMENT '备注信息',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `modify_time` datetime ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `login_time` datetime COMMENT '最后登录时间',
  `count_of_login` int(11) COMMENT '登录次数',
  `count_of_failed_login` int(11) COMMENT '连续登录失败次数',
  `creator_name` varchar(255) COMMENT '管理员创建者',
  `locked_out` boolean DEFAULT FALSE COMMENT '账号是否被锁定',
  `department_id` bigint(20) COMMENT '所属部门id，对应department表的id字段',
  `area_id` bigint(20) COMMENT '所在区域id，对应area表的id字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8 COMMENT='管理员表，存储管理员信息';