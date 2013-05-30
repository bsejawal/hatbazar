CREATE DATABASE `hatbazar`;
CREATE TABLE `user`(`id` INT AUTO_INCREMENT PRIMARY KEY, `name` VARCHAR (100), `address` VARCHAR (100), `email` VARCHAR (50), `phone` VARCHAR (15), `username` VARCHAR (25) NOT NULL UNIQUE KEY, `password` VARCHAR (20) NOT NULL);
CREATE TABLE `role`(`id` INT AUTO_INCREMENT PRIMARY KEY , `role_name` VARCHAR (50) NOT NULL UNIQUE KEY);
ALTER TABLE `user` ADD COLUMN `created_on` TIMESTAMP DEFAULT 0;
ALTER TABLE `user` MODIFY `created_on` TIMESTAMP DEFAULT CURRENT_TIMESTAMP;
ALTER TABLE `user`ADD COLUMN `changed_on` TIMESTAMP DEFAULT 0;

DROP TRIGGER IF EXISTS `update_user_trigger`;
DELIMITER //
CREATE TRIGGER `update_user_trigger` BEFORE UPDATE ON `user`
  FOR EACH ROW SET NEW.`changed_on`=NOW()
//
DELIMITER;

ALTER TABLE `user` change `password` `password` VARCHAR (32)
INSERT INTO `user` (`username`,`password`) VALUES ('sssh',MD5('b'));
UPDATE `user` SET `username`='h';