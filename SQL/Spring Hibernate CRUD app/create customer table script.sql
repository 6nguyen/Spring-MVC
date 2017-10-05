CREATE DATABASE IF NOT EXISTS `veterinary_clinic` /* !40100 DEFAULT CHARACTER SET=latin1 */;
USE `veterinary_clinic`;

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `email` varchar(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


/*  Creating sample data  */
INSERT INTO `customer` VALUES
	(1, 'Cloud', 'Strife', 'cf@gnguyen.com'),
    (2, 'Tidus', 'Blitzace', 'tb@gnguyen.com'),
    (3, 'Squall', 'Leonhart', 'sl@gnguyen.com'),
    (4, 'George', 'Nguyen', 'gn@gnguyen.com');
    

    
    
    
    
    

