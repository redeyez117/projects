-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 03, 2019 at 09:08 PM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `exercise`
--

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `ID` int(11) NOT NULL,
  `Dep_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`ID`, `Dep_name`) VALUES
(1, 'IT&Support'),
(2, 'Financa'),
(3, 'HR'),
(4, 'Zhvillimi'),
(5, 'Transporti');

-- --------------------------------------------------------

--
-- Table structure for table `picture`
--

CREATE TABLE `picture` (
  `picture_id` int(11) NOT NULL,
  `picture` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `picture`
--

INSERT INTO `picture` (`picture_id`, `picture`) VALUES
(3, 'img\\sally-persons-350_s220x308.jpg'),
(3, 'img\\sally-persons-350_s220x308.jpg'),
(1, 'img\\034-1.png'),
(2, 'img\\Reinhard Albers_1.jpg'),
(4, 'img\\Luzi-Seiler.jpg'),
(5, 'img\\Timothy_Persons_400.jpg'),
(6, 'img\\06242015obgyn-116-Person-Rachael-Web.jpg'),
(1, 'img\\034-1.png'),
(2, 'img\\Reinhard Albers_1.jpg'),
(4, 'img\\Luzi-Seiler.jpg'),
(5, 'img\\Timothy_Persons_400.jpg'),
(6, 'img\\06242015obgyn-116-Person-Rachael-Web.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `ID` tinyint(4) NOT NULL,
  `Name` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`ID`, `Name`) VALUES
(1, 'Admin'),
(2, 'Employee');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(4) NOT NULL,
  `Name` varchar(25) DEFAULT NULL,
  `Lastname` varchar(25) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Role_ID` tinyint(4) NOT NULL,
  `profile_pic_id` int(11) NOT NULL,
  `Dep_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Name`, `Lastname`, `Email`, `Password`, `Role_ID`, `profile_pic_id`, `Dep_ID`) VALUES
(1, 'Ardi', 'Bandilli', 'ardibandilli@gmail.com', '12345', 1, 3, 1),
(2, 'Marin', 'Hysollari', 'marinhysollari@gmail.com', 'user', 2, 3, 2),
(5, 'Flavio ', 'Peplekaj', 'flaviopeplekaj@gmail.com', 'user4', 2, 3, 3),
(6, 'Kevin', 'Sada', 'kevinsada@gmail.com', 'user5', 2, 3, 4),
(8, 'Kevin', 'Sada', 'kevinsada@gmail.com', 'user5', 2, 3, 4),
(9, 'Greg', 'Marku', 'gregmarku@gmail.com', 'admin123', 1, 1, 1),
(10, 'Artur', 'Dima', 'arturdima@gmail.com', 'user445', 1, 5, 1),
(11, 'Mimoza', 'Shkodra', 'mimoshkodra@gmail.com', 'user4567', 2, 6, 4),
(12, 'bledi', 'qato', 'blediqato@gmail.com', 'user212', 2, 4, 5),
(13, 'Loren', 'Kodra', 'korenkodra@gmail.com', 'user4321', 2, 5, 3),
(14, 'Dorian', 'Shatku', 'dorianshatku@gmail.com', 'user434', 2, 2, 5),
(15, 'Marsid', 'Koni', 'marsidkoni@gmail.com', 'user787', 2, 5, 4),
(16, 'Alketa', 'Veizi', 'alketaveizi@gmail.com', 'user444', 2, 4, 2),
(17, 'Esmeralda', 'Kaprrolli', 'esmekaprrolli@gmail.com', 'admin111', 1, 3, 1),
(18, 'Eltjon', 'Fiko', 'eltjonfiko@gmail.com', 'user333', 2, 1, 3),
(19, 'Greg', 'Marku', 'gregmarku@gmail.com', 'admin123', 1, 1, 1),
(20, 'Artur', 'Dima', 'arturdima@gmail.com', 'user445', 1, 5, 2),
(21, 'Mimoza', 'Shkodra', 'mimoshkodra@gmail.com', 'user4567', 2, 6, 4),
(22, 'bledi', 'qato', 'blediqato@gmail.com', 'user212', 2, 4, 5),
(23, 'Loren', 'Kodra', 'korenkodra@gmail.com', 'user4321', 2, 5, 3),
(24, 'Dorian', 'Shatku', 'dorianshatku@gmail.com', 'user434', 2, 2, 5),
(25, 'Marsid', 'Koni', 'marsidkoni@gmail.com', 'user787', 2, 5, 4),
(26, 'Alketa', 'Veizi', 'alketaveizi@gmail.com', 'user444', 2, 4, 4),
(27, 'Esmeralda', 'Kaprrolli', 'esmekaprrolli@gmail.com', 'admin111', 1, 3, 1),
(28, 'Eltjon', 'Fiko', 'eltjonfiko@gmail.com', 'user333', 2, 1, 3),
(29, 'Kostandina', '', 'dina.milo@gmail.com', '1111', 2, 0, 4),
(30, 'Klajdi', 'Spahia', 'spahia@gmail.com', '1111', 2, 0, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `department`
--
ALTER TABLE `department`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
