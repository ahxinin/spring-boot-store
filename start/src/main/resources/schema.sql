-- 数据表结构定义

-- 用户表
CREATE TABLE IF NOT EXISTS `t_user`
(`id` varchar(20) NOT NULL,
`account` varchar(32) NOT NULL,
`password` varchar(64) DEFAULT NULL,
PRIMARY KEY (`id`) );