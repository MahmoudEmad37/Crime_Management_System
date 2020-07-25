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
-- Table structure for table `police_table`
--

DROP TABLE IF EXISTS `police_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `police_table` (
  `police_id` int(11) NOT NULL,
  `police_name` varchar(45) NOT NULL,
  `police_password` varchar(45) NOT NULL,
  `police_gender` varchar(45) DEFAULT NULL,
  `police_birth_date` varchar(45) NOT NULL,
  `police_address` varchar(45) NOT NULL,
  `police_phone` varchar(45) NOT NULL,
  `police_rank` varchar(45) NOT NULL,
  `police_salary` double NOT NULL,
  `police_evaluation` int(11) DEFAULT NULL,
  `police_bouns` double DEFAULT NULL,
  `police_status` varchar(45) DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`police_id`),
  KEY `department_id` (`department_id`),
  CONSTRAINT `department_id` FOREIGN KEY (`department_id`) REFERENCES `department_table` (`department_id`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `police_table`
--

LOCK TABLES `police_table` WRITE;
/*!40000 ALTER TABLE `police_table` DISABLE KEYS */;
INSERT INTO `police_table` VALUES (1,'mahmoud','1','Male','21/1/1999','ain shams','1254','Officer',3990,-4,-1.33,'Available',1),(2,'karim','2','Male','2/1/2015','Octobr','25846','Officer',55611,15,5,'Available',2),(3,'fares','3','Male','6/1/2015','Hasona','32569','Officer',139027.5,15,5,'Available',2),(4,'farah','4','Female','20/2/2015','Maskn','25869','Captain',10428.148000000001,12,4,'Warned',1),(5,'Nader','5','Male','12/3/2014','Octobar','25478','Captain',1000,0,0,'Available',2),(6,'seif','6','Male','11/6/1999','kobri el oba','14782','Officer',27805.5,15,5,'Fired',1),(7,'krkr','7','Male','27/4/2019','Octobar','25478','Captain',5000,0,0,'Available',3),(9,'fady','9','Male','05/04/2019','afaffafafafa','012','Captain',20000,0,0,'Available',4),(10,'emad','10','Male','04/04/2019','fafafafa','022','Officer',20000,0,0,'Available',4),(11,'farahs.','11','Female','01/05/2019','asdf','12834663','Captain',10000,0,0,'Available',5),(12,'k','12','Male','06/05/2020','fhghfncn','456789','Officer',1000,0,0,'Available',5),(13,'lol','13','Female','20/05/2027','fgvbhnmkl','121515','Officer',-502.92,-1,-0.33,'Available',5),(14,'effff','14','Male','13/05/2015','3la el allah','123344','Officer',10000,0,0,'Available',5),(15,'7amo','15','Male','11/05/2005','qatameya','1234','Officer',1234,0,0,'Available',3),(16,'Alaa','16','Male','07/05/2014','Nasr City','123456789','Captain',12000,0,0,'Available',6),(17,'Samir','17','Male','01/05/2014','nasr city','5896413','Officer',5561.1,10,3.33,'Fired',6),(18,'Sun','18','Female','16/05/2013','nasr city','789546213','Officer',6673.32,10,3.33,'Available',6),(19,'farah','0','Female','10/05/2015','dfghjk','13357','Captain',123,0,0,'Available',7),(20,'faresd','0','Male','18/05/2015','fghj','1235','Officer',1234,0,0,'Available',7);
/*!40000 ALTER TABLE `police_table` ENABLE KEYS */;
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
