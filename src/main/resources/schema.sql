DROP TABLE IF EXISTS `restaurant`;
CREATE TABLE `restaurant` (
      `res_id` int NOT NULL,
      `name` varchar(80) NOT NULL,
      `url` varchar(255) DEFAULT NULL,
      `x` varchar(255) DEFAULT NULL,
      `y` varchar(255) DEFAULT NULL,
      PRIMARY KEY (`res_id`)
);

DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
    `category_id` int NOT NULL,
    `name` varchar(80) NOT NULL,
    PRIMARY KEY (`category_id`)
);

DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
   `tag_id` int NOT NULL,
   `name` varchar(80) NOT NULL,
   PRIMARY KEY (`tag_id`)
);

DROP TABLE IF EXISTS `restaurant_category`;
CREATE TABLE `restaurant_category` (
   `res_id` int NOT NULL,
   `category_id` int NOT NULL,
   PRIMARY KEY (`res_id`,`category_id`),
   FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`),
   FOREIGN KEY (`res_id`) REFERENCES `restaurant` (`res_id`)
);

DROP TABLE IF EXISTS `restaurant_tag`;
CREATE TABLE `restaurant_tag` (
  `res_id` int NOT NULL,
  `tag_id` int NOT NULL,
  PRIMARY KEY (`res_id`,`tag_id`),
  FOREIGN KEY (`res_id`) REFERENCES `restaurant` (`res_id`),
  FOREIGN KEY (`tag_id`) REFERENCES `tag` (`tag_id`)
);