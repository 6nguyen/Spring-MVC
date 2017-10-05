DROP SCHEMA IF EXISTS `hb-01-one-to-one-uni`;

CREATE SCHEMA `hb-01-one-to-one-uni`;

USE `hb-01-one-to-one-uni`;

/* 	Disable the FOREIGN_KEY_CHECKS for now */
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `instructor-detail`;

CREATE TABLE `instructor-detail` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `youtube_channel` varchar(128) DEFAULT NULL,
    `hobby` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)    
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


/*
	Create instructor table with FOREIGN KEY instructor_detail_id,
    value of which is referenced by the id column of the instructor_detail table
*/
DROP TABLE IF EXISTS `instructor`;

CREATE TABLE `instructor` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    `instructor_detail_id` int(11) NOT NULL,
    PRIMARY KEY (`id`),
    KEY `FK_DETAIL_idx` (`instructor_detail_id`),
    CONSTRAINT `FK_DETAIL` FOREIGN KEY (`instructor_detail_id`) 
		REFERENCES `instructor_detail` (`id`)
        ON DELETE NO ACTION 
        ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;