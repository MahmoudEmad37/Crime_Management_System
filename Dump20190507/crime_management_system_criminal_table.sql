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
-- Table structure for table `criminal_table`
--

DROP TABLE IF EXISTS `criminal_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `criminal_table` (
  `criminal_id` int(11) NOT NULL,
  `criminal_name` varchar(45) NOT NULL,
  `criminal_gender` varchar(45) NOT NULL,
  `criminal_birth_date` varchar(45) NOT NULL,
  `criminal_address` varchar(45) NOT NULL,
  `criminal_phone` varchar(45) DEFAULT NULL,
  `criminal_location` varchar(45) DEFAULT NULL,
  `criminal_dengerous_level` varchar(45) NOT NULL,
  `criminal_status` varchar(45) NOT NULL,
  PRIMARY KEY (`criminal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criminal_table`
--

LOCK TABLES `criminal_table` WRITE;
/*!40000 ALTER TABLE `criminal_table` DISABLE KEYS */;
INSERT INTO `criminal_table` VALUES (1,'fares','Male','30/9/2015','hassona','012584','bate','High','Involved in case'),(2,'mohamed','Male','28/4/2018','Cairo','012569','bate','High','Involved in case'),(3,'Amira','Female','12/12/2015','shobraa','02158','Cairo','High','Involved in case'),(4,'frosso','Female','03/04/2019','beta','1254','beta','Moderate','Involved in case'),(5,'fady','Male','10/04/2019','fafafafafafa','012','fafa','Very High','Under investigation'),(6,'mero','Male','18/04/2019','beta','01254','beta','Moderate','Under investigation'),(7,'mnvdj','Male','03/04/2019','csk','01254','nvjd','Low','Under investigation'),(8,'frosso','Male','04/04/2019','fafaaf','012','fafafa','High','Under investigation'),(9,'ana el kateel','Male','27/05/2014','msh ht3rfoli mkan','0123456','in air','Very High','Under investigation'),(10,'killer','Male','03/05/2013','fel mtbaaa5','12345','kill street','High','Under investigation'),(11,'hany','Male','07/05/2015','nasr city','16513215','hrbaan','Moderate','Involved in case'),(12,'mahmoud','Male','26/05/2014','gdjshek','123456','sign','Moderate','Involved in case');
/*!40000 ALTER TABLE `criminal_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07 23:49:42
