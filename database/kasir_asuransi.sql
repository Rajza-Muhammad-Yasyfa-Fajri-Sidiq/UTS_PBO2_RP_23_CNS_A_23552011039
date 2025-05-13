-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2025 at 08:58 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir_asuransi`
--

-- --------------------------------------------------------

--
-- Table structure for table `klaim`
--

CREATE TABLE `klaim` (
  `id` int(11) NOT NULL,
  `polis_id` int(11) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nasabah`
--

CREATE TABLE `nasabah` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `umur` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nasabah`
--

INSERT INTO `nasabah` (`id`, `nama`, `umur`) VALUES
(3277023, 'Supratman', 25),
(3277024, 'Budi Santoso', 30),
(3277025, 'Ani Rahmawati', 28),
(3277026, 'Dewi Lestari', 32),
(3277027, 'Fajar Nugroho', 27),
(3277028, 'Siti Aisyah', 29),
(3277029, 'Rizky Pratama', 35),
(3277030, 'Nanda Saputra', 26),
(3277031, 'Yuliana Putri', 31),
(3277032, 'Agus Supriyadi', 40),
(3277033, 'Wulan Maharani', 24),
(3277034, 'Bayu Rahman', 33),
(3277035, 'Mega Fitriani', 36),
(3277036, 'Reza Kurniawan', 29),
(3277037, 'Citra Anggraini', 27),
(3277038, 'Dedi Firmansyah', 38),
(3277039, 'Indah Sari', 34),
(3277040, 'Arif Maulana', 31),
(3277041, 'Mira Octaviani', 23),
(3277042, 'Andi Wijaya', 28);

-- --------------------------------------------------------

--
-- Table structure for table `polis`
--

CREATE TABLE `polis` (
  `id` int(11) NOT NULL,
  `nasabah_id` int(11) DEFAULT NULL,
  `jenis` varchar(50) DEFAULT NULL,
  `premi` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `polis`
--

INSERT INTO `polis` (`id`, `nasabah_id`, `jenis`, `premi`) VALUES
(2, 3277042, 'Kesehatan', 500000),
(3, 3277041, 'Kesehatan', 500000),
(4, 3277039, 'Jiwa', 750000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `klaim`
--
ALTER TABLE `klaim`
  ADD PRIMARY KEY (`id`),
  ADD KEY `polis_id` (`polis_id`);

--
-- Indexes for table `nasabah`
--
ALTER TABLE `nasabah`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `polis`
--
ALTER TABLE `polis`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nasabah_id` (`nasabah_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `klaim`
--
ALTER TABLE `klaim`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `polis`
--
ALTER TABLE `polis`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `klaim`
--
ALTER TABLE `klaim`
  ADD CONSTRAINT `klaim_ibfk_1` FOREIGN KEY (`polis_id`) REFERENCES `polis` (`id`);

--
-- Constraints for table `polis`
--
ALTER TABLE `polis`
  ADD CONSTRAINT `polis_ibfk_1` FOREIGN KEY (`nasabah_id`) REFERENCES `nasabah` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
