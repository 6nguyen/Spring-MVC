/* create user: 6nguyen with password: password */
CREATE USER 'nguyen'@'localhost' IDENTIFIED BY 'password';

GRANT ALL PRIVILEGES ON * . * TO 'nguyen'@'localhost';