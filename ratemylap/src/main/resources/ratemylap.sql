-- MySQL dump 10.13  Distrib 5.7.13, for Win64 (x86_64)
--
-- Host: localhost    Database: ratemylap
-- ------------------------------------------------------
-- Server version	5.7.13-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `ratemylap`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ratemylap` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ratemylap`;

--
-- Table structure for table `lapmodel`
--

DROP TABLE IF EXISTS `lapmodel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lapmodel` (
  `LAPMODELID` int(11) NOT NULL,
  `LAPMODELNAME` varchar(45) NOT NULL,
  `LAPMODELDESC` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`LAPMODELID`),
  UNIQUE KEY `LAPMODELNAME_UNIQUE` (`LAPMODELNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lapmodel`
--

LOCK TABLES `lapmodel` WRITE;
/*!40000 ALTER TABLE `lapmodel` DISABLE KEYS */;
INSERT INTO `lapmodel` VALUES (1,'HP-Corei7','Intel-Corei7-ProBook'),(2,'HP-Corei5','Intel-Corei5-Game'),(3,'HP-Corei3','Intel-Corei3-Eco'),(4,'DELL-Corei7','Intel-Corei7-Vostro'),(5,'DELL-Corei5','Intel-Corei5-Maestro');
/*!40000 ALTER TABLE `lapmodel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `laprating`
--

DROP TABLE IF EXISTS `laprating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `laprating` (
  `LAPRATINGID` int(11) NOT NULL AUTO_INCREMENT,
  `LAPMODELID` int(11) DEFAULT NULL,
  `LAPRATING` int(11) DEFAULT '1',
  `LAPRATINGCMT` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`LAPRATINGID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `laprating`
--

LOCK TABLES `laprating` WRITE;
/*!40000 ALTER TABLE `laprating` DISABLE KEYS */;
INSERT INTO `laprating` VALUES (1,1,3,'Good Laptop'),(2,NULL,NULL,NULL),(3,NULL,NULL,NULL),(4,NULL,NULL,NULL),(5,NULL,NULL,NULL),(6,NULL,NULL,NULL),(7,1,4,'Happy with the laptop model and is working fine');
/*!40000 ALTER TABLE `laprating` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-19 19:16:46
