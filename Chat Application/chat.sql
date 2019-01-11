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
-- Database: `chat`
--

-- --------------------------------------------------------

--
-- Table structure for table `chat_message`
--

CREATE TABLE `chat_message` (
  `chat_message_id` int(11) NOT NULL,
  `to_user_id` int(11) NOT NULL,
  `from_user_id` int(11) NOT NULL,
  `chat_message` longtext NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `chat_message`
--

INSERT INTO `chat_message` (`chat_message_id`, `to_user_id`, `from_user_id`, `chat_message`, `timestamp`) VALUES
(1, 5, 1, 'hi', '2019-01-03 18:43:26'),
(2, 2, 1, 'hi', '2019-01-03 18:44:05'),
(3, 5, 1, 'hi', '2019-01-03 18:44:43'),
(4, 5, 1, '', '2019-01-03 18:44:46'),
(5, 5, 1, '', '2019-01-03 18:44:47'),
(6, 5, 1, '', '2019-01-03 18:44:47'),
(7, 5, 1, '', '2019-01-03 18:44:48'),
(8, 6, 1, 'hello from hollivud', '2019-01-03 18:44:56'),
(9, 6, 1, '', '2019-01-03 18:44:58'),
(10, 6, 1, '', '2019-01-03 18:44:59'),
(11, 6, 1, '', '2019-01-03 18:45:00'),
(12, 6, 1, '', '2019-01-03 18:45:00'),
(13, 6, 1, '', '2019-01-03 18:45:00'),
(14, 2, 1, 'hi', '2019-01-03 18:47:10'),
(15, 2, 1, 'asdadasd', '2019-01-03 18:47:18'),
(16, 2, 1, '', '2019-01-03 18:47:18'),
(17, 2, 1, '', '2019-01-03 18:47:18'),
(18, 2, 1, '', '2019-01-03 18:47:19'),
(19, 2, 1, 'asdasdasd', '2019-01-03 18:47:20'),
(20, 2, 1, 'hi', '2019-01-03 19:40:02'),
(21, 2, 1, 'hi\n', '2019-01-03 19:42:29'),
(22, 2, 1, 'hello\n', '2019-01-03 19:43:22'),
(23, 2, 1, 'marin', '2019-01-03 19:44:44'),
(24, 6, 1, 'hi\n', '2019-01-03 19:46:35'),
(25, 6, 1, 'hello from mars\n', '2019-01-03 20:00:56'),
(26, 6, 1, 'sumatrice\n', '2019-01-03 20:02:53'),
(27, 6, 1, 'othertest\n', '2019-01-03 20:04:12'),
(28, 6, 1, 'zxzx', '2019-01-03 20:05:02'),
(29, 6, 1, 'another try', '2019-01-03 20:06:18'),
(30, 6, 1, 'fail again', '2019-01-03 20:06:55');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`) VALUES
(1, 'ardibandilli', '12345'),
(2, 'marinhysollari', '11111'),
(5, 'pewdiepie', '22222'),
(6, 'SKT T1 Faker', '33333');

-- --------------------------------------------------------

--
-- Table structure for table `login_details`
--

CREATE TABLE `login_details` (
  `login_details_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `last_activity` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login_details`
--

INSERT INTO `login_details` (`login_details_id`, `user_id`, `last_activity`) VALUES
(11, 2, '2018-12-30 21:50:43'),
(12, 1, '2018-12-31 15:50:02'),
(13, 2, '2018-12-31 15:52:50'),
(14, 1, '2018-12-31 15:57:52'),
(15, 2, '2019-01-01 15:28:19'),
(16, 1, '2019-01-01 15:28:39'),
(17, 6, '2019-01-01 15:29:37'),
(18, 1, '2019-01-01 15:31:13'),
(19, 1, '2019-01-01 15:34:01'),
(20, 2, '2019-01-01 15:47:59'),
(21, 1, '2019-01-01 15:53:39'),
(22, 1, '2019-01-01 15:59:13'),
(23, 2, '2019-01-01 15:59:25'),
(24, 2, '2019-01-01 15:59:58'),
(25, 2, '2019-01-01 16:01:42'),
(26, 1, '2019-01-01 16:01:44'),
(27, 2, '2019-01-01 16:23:22'),
(28, 1, '2019-01-01 16:23:24'),
(29, 1, '2019-01-02 14:41:11'),
(30, 2, '2019-01-02 14:41:30'),
(31, 1, '2019-01-03 18:07:52'),
(32, 2, '2019-01-03 19:21:11'),
(33, 1, '2019-01-03 19:21:28'),
(34, 1, '2019-01-03 19:42:48'),
(35, 2, '2019-01-03 19:43:05'),
(36, 6, '2019-01-03 19:46:24');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chat_message`
--
ALTER TABLE `chat_message`
  ADD PRIMARY KEY (`chat_message_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login_details`
--
ALTER TABLE `login_details`
  ADD PRIMARY KEY (`login_details_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chat_message`
--
ALTER TABLE `chat_message`
  MODIFY `chat_message_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `login_details`
--
ALTER TABLE `login_details`
  MODIFY `login_details_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
