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
-- Table structure for table `witness_table`
--

DROP TABLE IF EXISTS `witness_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `witness_table` (
  `witness_id` int(11) NOT NULL,
  `witness_name` varchar(45) NOT NULL,
  `witness_gender` varchar(45) NOT NULL,
  `witness_birth_date` varchar(45) NOT NULL,
  `witness_address` varchar(45) NOT NULL,
  `witness_phone` varchar(45) NOT NULL,
  `case_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`witness_id`),
  KEY `case_id_idx` (`case_id`),
  CONSTRAINT `case_id_fk2` FOREIGN KEY (`case_id`) REFERENCES `case_table` (`case_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `witness_table`
--

LOCK TABLES `witness_table` WRITE;
/*!40000 ALTER TABLE `witness_table` DISABLE KEYS */;
INSERT INTO `witness_table` VALUES (1,'khaled','Male','12/5/1999','Cairo','012545698',3),(2,'Aya','Female','11/2/2003','Giza','012548745',3),(3,'fares','Male','05/04/2019','fafafafafa','012',3),(4,'shahd mshafsh haga','Male','08/05/2019','el masr7yaa','121515',5),(5,'adel emam','Male','08/05/1969','fel masr7ya brdo','123456',7),(6,'ss','Male','17/05/2019','jnjnjn','123',7),(7,'fahd','Male','26/05/2015','nasr city','1023589',10),(8,'sief','Male','16/05/2011','gjkklnkln','12345',3);
/*!40000 ALTER TABLE `witness_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-07 23:49:39
