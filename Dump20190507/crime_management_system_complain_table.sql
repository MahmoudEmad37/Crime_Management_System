-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: crime_management_system
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `complain_table`
--

DROP TABLE IF EXISTS `complain_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `complain_table` (
  `complain_id` int(11) NOT NULL AUTO_INCREMENT,
  `complain_text` text NOT NULL,
  `complain_date` varchar(45) NOT NULL,
  `complain_bool` tinyint(4) DEFAULT '0',
  `comp_seen` tinyint(4) DEFAULT '1',
  `officers_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`complain_id`),
  KEY `officier_id_idx` (`officers_id`),
  CONSTRAINT `officier_id` FOREIGN KEY (`officers_id`) REFERENCES `police_table` (`police_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `complain_table`
--

LOCK TABLES `complain_table` WRITE;
/*!40000 ALTER TABLE `complain_table` DISABLE KEYS */;
INSERT INTO `complain_table` VALUES (6,'msh byakool kways','03/05/2019',0,0,6),(7,'hmy ,','03/05/2019',0,0,6),(8,'3ayz yt5smlhaa ','03/05/2019',0,1,4),(10,'test','03/05/2019',0,1,13),(11,'nsheel kol el cases bta3to :D','06/05/2019',0,0,6),(12,'awerty','07/05/2019',0,0,17),(13,'delw2tii','07/05/2019',0,1,1),(14,'now','07/05/2019',0,1,1);
/*!40000 ALTER TABLE `complain_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07 23:49:40
