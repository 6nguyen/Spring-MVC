CREATE DATABASE  IF NOT EXISTS `hb_student_tracker`;
USE `hb_student_tracker`;

DROP TABLE IF EXISTS `student`;

/*  */
CREATE TABLE `student` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;

/*  Change the id Primary Key value to start from 1000 from this point on  */
ALTER TABLE hb_student_tracker.student AUTO_INCREMENT = 1000;

/*  Add column Date of Birth to Student table */
ALTER TABLE hb_student_tracker.student 
ADD COLUMN `date_of_birth` 
DATETIME NULL
AFTER `email`;

/* Update students to have a date_of_birth */
UPDATE Student SET date_of_birth='03/24/1990' WHERE date_of_birth=null;