-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: ejpmarketdb
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `userID` varchar(5) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `password` int(4) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('admin','admin',1234);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categories` (
  `catId` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `descri` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`catId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Limpeza','Produtos de limpeza'),(2,'Refrigerantes','Refrigerantes'),(3,'Bebidas','Bebidas em geral'),(4,'Carnes','Carnes'),(5,'Horti-fruti','Legumes e verduras'),(6,'Verduras','Verduras em geral'),(7,'Perfumaria','Perfumes, shampoos, sabonete etc.'),(8,'Congelados e frios','Presunto, queijo, salame, etc.'),(9,'Laticínios','Leite, iorgute, etc.'),(10,'Papelarias','Cadernos, canetas, agendas, etc.'),(11,'Perfumes','perfumes');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `prodID` int(11) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `quantid` int(11) NOT NULL,
  `preco` float NOT NULL,
  `categoria` varchar(50) NOT NULL,
  PRIMARY KEY (`prodID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'coca-cola',63,4,'Refrigerantes'),(2,'pepsi-cola',68,3.5,'Refrigerantes'),(3,'alface',16,5,'Horti-fruti'),(4,'Repolho',10,5,'Horti-fruti'),(5,'Maça',30,2,'Horti-fruti'),(6,'Leite',10,2.5,'Laticíneios'),(7,'Queijo mussarela',18,25,'Congelados e frios'),(8,'Queijo coalho',28,15,'Congelados e frios'),(9,'Presunto',23,25,'Congelados e frios'),(10,'Shampoo',40,19,'Perfumaria'),(11,'Condicionardor',35,19,'Perfumaria'),(12,'Sabonete',50,2,'Perfumaria'),(13,'Tintura para cabelo',50,20,'Perfumaria'),(15,'Caderno dez matérias',20,19,'Papelarias'),(16,'Caneta cor preta',60,1.5,'Papelarias'),(17,'Agenda pequena',20,15,'Papelarias'),(18,'Desinfetante',27,6,'Limpeza'),(19,'Água sanitária',20,1.7,'Limpeza'),(20,'Esponja limpeza',23,5,'Limpeza'),(21,'Morango',13,7,'Horti-fruti'),(22,'Banana',30,1,'Horti-fruti'),(23,'Uva',14,8,'Horti-fruti');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relatorio`
--

DROP TABLE IF EXISTS `relatorio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `relatorio` (
  `vendaId` int(11) NOT NULL AUTO_INCREMENT,
  `vendedor` varchar(50) DEFAULT NULL,
  `valor` float DEFAULT NULL,
  PRIMARY KEY (`vendaId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relatorio`
--

LOCK TABLES `relatorio` WRITE;
/*!40000 ALTER TABLE `relatorio` DISABLE KEYS */;
INSERT INTO `relatorio` VALUES (1,'Jonathas Tavares',100),(2,'Alexandre lins',7),(3,'Aline Braga',5),(4,'Aline Braga',4),(5,'Marcos Vinicius',7.5),(6,'Jonathas Tavares',7);
/*!40000 ALTER TABLE `relatorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sellers`
--

DROP TABLE IF EXISTS `sellers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sellers` (
  `userID` varchar(10) NOT NULL,
  `nome` varchar(20) NOT NULL,
  `password` int(4) NOT NULL,
  PRIMARY KEY (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sellers`
--

LOCK TABLES `sellers` WRITE;
/*!40000 ALTER TABLE `sellers` DISABLE KEYS */;
INSERT INTO `sellers` VALUES ('aleLins','Alexandre lins',4321),('AlineB','Aline ',1234),('Cleide','Cleide',1234),('JonathasL','Jonathas Tavares',1234),('MVinicius','Marcos Vinicius',1234);
/*!40000 ALTER TABLE `sellers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-28 19:52:27
