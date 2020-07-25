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
-- Table structure for table `case_table`
--

DROP TABLE IF EXISTS `case_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `case_table` (
  `case_id` int(11) NOT NULL,
  `date_occurance` varchar(45) NOT NULL,
  `case_status` varchar(45) NOT NULL,
  `crime_type` varchar(45) NOT NULL,
  `crime_location` varchar(45) NOT NULL,
  `start_date` varchar(45) DEFAULT NULL,
  `last_update_date` varchar(45) DEFAULT NULL,
  `case_desc` text,
  `department_id` int(11) DEFAULT NULL,
  `isAssigned` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`case_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `case_table`
--

LOCK TABLES `case_table` WRITE;
/*!40000 ALTER TABLE `case_table` DISABLE KEYS */;
INSERT INTO `case_table` VALUES (1,'15/4/2019','Investigating','Search','Hasona','07/05/2019','18/4/2019','the case is easy case',1,1),(2,'12/4/2019','Closed','Marder','Ain Shams','14/4/2019','17/4/2019','the case is easy case',1,1),(3,'23/4/2019','Solved','Steal','fel beet','27/7/2018','07/05/19','emskooh',2,1),(4,'05/04/2019','Investigating','2tl','fafafafafa','28/04/2019','28/04/2019','ana 7r want malk dea',4,0),(5,'18/05/2016','Investigating','nashl brdo','fel beet','3/7/2015','02/05/2019','emseeeek 7ramiii yalahwiiii',5,1),(6,'01/05/2019','Investigating','ser2t mt7aaf','mt7af farah','02/05/2019','02/05/2019','lewa7iiii',5,0),(7,'05/05/2011','Investigating','ateel fel ghorfaa','villa','3/7/2015','06/05/19','lwlwlwlwlw',1,1),(8,'15/05/2014','Investigating','bdwar 3la haga msh la2ihaa','msh fakraa','3/7/2015','07/05/19','ana 3ayza el haga el day3a minii',2,1),(9,'23/05/2011','Investigating','7omorya','el m3adi','','','fkasnfkanga',2,0),(10,'03/05/2018','Investigating','Heroine','nasr city','07/05/2019','07/05/19','motalbes',6,1);
/*!40000 ALTER TABLE `case_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07 23:49:41
