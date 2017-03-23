DROP TABLE IF EXISTS  `city`;
CREATE TABLE `city` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
  `province_id` int(10) unsigned  NOT NULL COMMENT '省份编号',
  `city_name` varchar(25) DEFAULT NULL COMMENT '城市名称',
  `description` varchar(25) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS  `user`;
CREATE TABLE `user` (
  `id` bigint(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '',
  `name` varchar(100) unsigned  NOT NULL COMMENT '',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

INSERT user Values(1,'CGZ',39);

INSERT city VALUES (1 ,1,'温岭市','BYSocket 的家在温岭。');