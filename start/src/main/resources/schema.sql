-- 数据表结构定义

-- 用户表
CREATE TABLE IF NOT EXISTS `t_user`
(`id` int(11) NOT NULL AUTO_INCREMENT,
`account` varchar(32) NOT NULL,
`password` varchar(64) DEFAULT NULL,
PRIMARY KEY (`id`) );

-- 商品表
CREATE TABLE IF NOT EXISTS `t_good`
(`id` int(11) NOT NULL AUTO_INCREMENT,
`name` varchar(32) NOT NULL,
`describe` varchar(64) DEFAULT NULL,
`price` int(11) NOT NULL
PRIMARY KEY (`id`) );

-- 订单表
CREATE TABLE IF NOT EXISTS `t_order`
(`id` int(11) NOT NULL AUTO_INCREMENT,
`userId` int(11) NOT NULL,
`goodId` int(11) NOT NULL,
`goodNum`int(11) NOT NULL,
`goodPrice`int(11) NOT NULL,
`amount` int(11) NOT NULL,
`status` varchar(32) NOT NULL
PRIMARY KEY (`id`) );