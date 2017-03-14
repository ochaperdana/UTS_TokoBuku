-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2017 at 12:42 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_kasir`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_produk`
--

CREATE TABLE IF NOT EXISTS `tb_produk` (
  `id_produk` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` varchar(255) NOT NULL,
  PRIMARY KEY (`id_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_produk`
--

INSERT INTO `tb_produk` (`id_produk`, `nama_produk`, `harga_produk`) VALUES
(1, 'Buku Tulis abc', '28000'),
(2, 'Buku tulis dce', '23000'),
(3, 'buku folio bbb', '18500'),
(4, 'Pensil gre', '4500'),
(5, 'Buku folio 1233', '17000'),
(6, 'Penghapus anti ilang', '6500'),
(7, 'Kertas A4 Sinar Dunia', '42000');

-- --------------------------------------------------------

--
-- Table structure for table `tb_transaksi`
--

CREATE TABLE IF NOT EXISTS `tb_transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_produk` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` varchar(255) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` varchar(255) NOT NULL,
  `nama_kasir` varchar(255) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  PRIMARY KEY (`id_transaksi`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data for table `tb_transaksi`
--

INSERT INTO `tb_transaksi` (`id_transaksi`, `id_produk`, `nama_produk`, `harga_produk`, `qty`, `total`, `nama_kasir`, `tgl_transaksi`) VALUES
(1, 0, 'Buku Tulis abc', '28000', 3, '84000', 'Kylie', '2017-03-15'),
(2, 4, 'Pensil gre', '4500', 10, '45000', 'Mimi', '2017-03-15'),
(3, 3, 'buku folio bbb', '18500', 2, '37000', 'Mimi', '2017-03-14'),
(4, 4, 'Pensil gre', '4500', 20, '90000', 'Mimi', '2017-03-15'),
(5, 3, 'buku folio bbb', '18500', 2, '37000', 'Mimi Peri', '2017-03-15'),
(6, 5, 'Buku folio 1233', '17000', 10, '153000.0', 'Mince', '2017-03-15'),
(7, 6, 'Penghapus anti ilang', '6500', 18, '105300.0', 'Baifern', '2017-03-14'),
(8, 7, 'Kertas A4 Sinar Dunia', '42000', 4, '151200.0', 'Dana', '2017-03-14');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
