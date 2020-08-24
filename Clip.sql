CREATE database if NOT EXISTS `clip_db` default character set utf8mb4 collate utf8mb4_unicode_ci;
use `clip_db`;

SET NAMES utf8mb4;

CREATE TABLE `t_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_content` varchar(255) DEFAULT NULL,
  `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
`update_time` DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_item
-- ----------------------------
BEGIN;
INSERT INTO t_item(item_content) VALUES('content test');
INSERT INTO t_item(item_content) VALUES('ffewaw');
COMMIT;