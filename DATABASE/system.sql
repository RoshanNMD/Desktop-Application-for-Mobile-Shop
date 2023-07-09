-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 10, 2018 at 11:27 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `system`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_stock`
--

CREATE TABLE `add_stock` (
  `id` int(11) NOT NULL,
  `emiNo` varchar(10) NOT NULL,
  `model` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `capacity` varchar(10) NOT NULL,
  `warrenty` varchar(10) NOT NULL,
  `Tot_imported` int(11) NOT NULL,
  `unit_prc` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_stock`
--

INSERT INTO `add_stock` (`id`, `emiNo`, `model`, `brand`, `capacity`, `warrenty`, `Tot_imported`, `unit_prc`) VALUES
(1, 'emi122', 'samsungj7', 'samsung', '32gb', '5yr', 450, 20000);

-- --------------------------------------------------------

--
-- Table structure for table `delete_1`
--

CREATE TABLE `delete_1` (
  `custumerID` int(18) NOT NULL,
  `feedback` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delete_1`
--

INSERT INTO `delete_1` (`custumerID`, `feedback`) VALUES
(234, 'asdsad'),
(1223, 'dsdsdsdsd'),
(456, 'fghfvg'),
(12345, 'iyguyh');

-- --------------------------------------------------------

--
-- Table structure for table `delivary`
--

CREATE TABLE `delivary` (
  `cName` varchar(255) NOT NULL,
  `cAddress` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `iName` varchar(255) NOT NULL,
  `vehicleId` varchar(255) NOT NULL,
  `driverId` varchar(255) NOT NULL,
  `orderId` varchar(255) NOT NULL,
  `Quantity` varchar(255) NOT NULL,
  `Cid` int(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `delivary`
--

INSERT INTO `delivary` (`cName`, `cAddress`, `description`, `iName`, `vehicleId`, `driverId`, `orderId`, `Quantity`, `Cid`) VALUES
('wewe', 'rew', 'werwer', 'erwe', 'rwer', 'werw', '12', '12', 14),
('ew', 'ew', 'wewe', 'we', 'rtrt', 'rtrt', '12', '12', 13),
('aafsa', 'sadsad', 'sadasd', 'asdsad', '124124', '214124124124', '124124', '124124', 16);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `FullName` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `DateOfBirth` varchar(255) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `ContactNo` varchar(255) NOT NULL,
  `Designation` varchar(10) NOT NULL,
  `DateOfJoin` varchar(255) NOT NULL,
  `NIC` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`, `FullName`, `Gender`, `DateOfBirth`, `Address`, `Email`, `ContactNo`, `Designation`, `DateOfJoin`, `NIC`) VALUES
(16, 'vvvvvv', 'Male', '2018-09-04', 'n,kbhnvnvnbv', 'sdaf@gmail.com', '52752', 'jcmcjnm', '2018-09-04', '23424s'),
(13, 'aaaaaa', 'Male', '2018-09-04', 'n,kbhnvnvnbv', 'sdaf@gmail.com', '52752', 'jcmcjnm', '2018-09-04', '1111');

-- --------------------------------------------------------

--
-- Table structure for table `genarate`
--

CREATE TABLE `genarate` (
  `customerID` int(18) NOT NULL,
  `Amount` int(200) NOT NULL,
  `points` int(50) NOT NULL,
  `offers` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `home`
--

CREATE TABLE `home` (
  `id` int(5) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `position` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `home`
--

INSERT INTO `home` (`id`, `username`, `password`, `position`) VALUES
(1, 'ramesha', 'ramesha', 'admin'),
(2, 'sapna', 'sapna', 'employee');

-- --------------------------------------------------------

--
-- Table structure for table `only`
--

CREATE TABLE `only` (
  `brand` varchar(20) NOT NULL,
  `model` varchar(20) NOT NULL,
  `colour` varchar(20) NOT NULL,
  `storage` varchar(20) NOT NULL,
  `quantity` int(20) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `address` varchar(40) NOT NULL,
  `payment` varchar(20) NOT NULL,
  `cardno` varchar(20) NOT NULL,
  `cardname` varchar(20) NOT NULL,
  `code` varchar(20) NOT NULL,
  `carddate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `only`
--

INSERT INTO `only` (`brand`, `model`, `colour`, `storage`, `quantity`, `contact`, `address`, `payment`, `cardno`, `cardname`, `code`, `carddate`) VALUES
('Samsung', 'A45', 'Black', '128 GB', 25, '0712536685', 'Colombo', 'Visa', '124578', 'Hemal', '147', '2025-12-01'),
('Apple Iphone', '213', 'red', '8 GB', 50, '12312', 'asdsa', 'Visa', '700000', 'bhashana', '123', '2025-12-14');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `OrderID` int(4) NOT NULL,
  `Discription` varchar(20) DEFAULT NULL,
  `Name` varchar(20) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `ContactNO` int(10) NOT NULL,
  `OrderDate` varchar(100) DEFAULT NULL,
  `OrderDueDate` varchar(18) DEFAULT NULL,
  `ItemID` int(4) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `OrderItem` varchar(50) NOT NULL,
  `ItemDetails` varchar(20) NOT NULL,
  `Discount` double NOT NULL,
  `UnitPrice` double NOT NULL,
  `TotalPrice` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`OrderID`, `Discription`, `Name`, `NIC`, `ContactNO`, `OrderDate`, `OrderDueDate`, `ItemID`, `Quantity`, `OrderItem`, `ItemDetails`, `Discount`, `UnitPrice`, `TotalPrice`) VALUES
(19, 'HTC m8', 'manura', '97466421v', 7125548, '2018-09-14', '2018-09-05', 2177, 3, 'Mobile Phone (fullset)', 'good condition', 100, 150000, 150000),
(21, 'sony', 'oshanda', '9655212v', 77553252, '2018-09-20', '2018-09-13', 55, 4, 'Chager only', 'brand new', 0, 4000, 1000),
(28, 'eeeeeeeeee', 'wdwddwd', '962771920v', 779690781, '2018-10-10', '2018-10-17', 1212, 1, 'Mobile Phone (fullset)', 'dsdsdsdsdsd', 10, 10000, 10000),
(30, 'apple i phone', 'yaith', '5554566V', 77335542, '2018-10-16', '2018-10-12', 2122, 3, 'Hand Free only', 'good condition', 78, 65, 65),
(31, 'iphone', 'dhnaud', '97534585', 773367186, '2018-10-17', '2018-10-10', 788, 2, 'Hand Free only', 'good condition', 10, 2000, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `apname` varchar(80) NOT NULL,
  `apid` varchar(20) NOT NULL,
  `type` varchar(80) NOT NULL,
  `apd` varchar(80) NOT NULL,
  `apmdate` varchar(80) NOT NULL,
  `apfac` varchar(80) NOT NULL,
  `apprice` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`apname`, `apid`, `type`, `apd`, `apmdate`, `apfac`, `apprice`) VALUES
('apple', '001a', 'Medical', 'asdfe		', '12.01.2010', 'Colombo', '1250.00');

-- --------------------------------------------------------

--
-- Table structure for table `profit`
--

CREATE TABLE `profit` (
  `Id` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `Profit` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profit`
--

INSERT INTO `profit` (`Id`, `date`, `Profit`) VALUES
('1', '2018-09-10', 25000),
('2', '2018-10-10', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

CREATE TABLE `register` (
  `registerId` int(18) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `dob` date NOT NULL,
  `NIC` int(40) NOT NULL,
  `Gender` varchar(12) NOT NULL,
  `email` varchar(211) NOT NULL,
  `pass1` varchar(11) NOT NULL,
  `pass2` varchar(11) NOT NULL,
  `address` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rejectitem`
--

CREATE TABLE `rejectitem` (
  `Rid` int(5) NOT NULL,
  `RemiNo` varchar(20) NOT NULL,
  `Rmodel` varchar(20) NOT NULL,
  `RdateSt` date NOT NULL,
  `RrejectD` date NOT NULL,
  `Rreason` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rejectitem`
--

INSERT INTO `rejectitem` (`Rid`, `RemiNo`, `Rmodel`, `RdateSt`, `RrejectD`, `Rreason`) VALUES
(2, 'emi33', 'Apple i phone 6s', '2018-02-12', '2018-03-05', 'damage display122'),
(4, 'emi54', 'Nokia 1100', '2018-05-01', '2018-05-03', 'battery problem');

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `customerID` int(18) NOT NULL,
  `feedback` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`customerID`, `feedback`) VALUES
(234, 'esfd'),
(1223, '3wwewe'),
(456, 'ughujh'),
(456, 'ihbhjb');

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `id` int(11) NOT NULL,
  `nic` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `designation` varchar(255) NOT NULL,
  `workinghours` varchar(255) NOT NULL,
  `basic` varchar(255) NOT NULL,
  `allowance` varchar(255) NOT NULL,
  `bonus` varchar(255) NOT NULL,
  `ot` varchar(255) NOT NULL,
  `deduction` varchar(255) NOT NULL,
  `netsalary` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`id`, `nic`, `name`, `designation`, `workinghours`, `basic`, `allowance`, `bonus`, `ot`, `deduction`, `netsalary`) VALUES
(1, '475757575', 'test', 'test2', '10', '1500', '120', '4500', '1200', '100', '25000'),
(2, '1234566', 'test2', 'malabe', '1', '2', '3', '4', '5', '7', '6'),
(3, '97', 'ramesha', 'abcd', '10', '1000', '100', '100', '2', '150', ''),
(4, '87', 'test1', 'teat', '8', '1000', '100', '500', '2', '150', '1120'),
(5, '12345678V', 'Sample', 'Malabe', '10', '20000', '2000', '1500', '5', '1000', '20150'),
(6, '123', 'test123', 'abcd', '8', '1000', '200', '150', '3', '100', '1120'),
(7, '234', 'asd', 'asd', '23', '34', '213', '123', '12', '1', ''),
(8, '56', 'rame', 'fghhj', '12', '1200', '100', '500', '2', '100', '1380'),
(9, '123', 'abcdef', 'mnmjkuity', '8', '12000', '1000', '500', '2', '400', '');

-- --------------------------------------------------------

--
-- Table structure for table `sales`
--

CREATE TABLE `sales` (
  `SalesID` int(11) NOT NULL,
  `billNo` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Balance` double NOT NULL,
  `Contact` varchar(10) NOT NULL,
  `Qty` int(11) NOT NULL,
  `Rate` double NOT NULL,
  `Cash` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sales`
--

INSERT INTO `sales` (`SalesID`, `billNo`, `Date`, `Name`, `Balance`, `Contact`, `Qty`, `Rate`, `Cash`, `Total`) VALUES
(2, 48567, '2018-10-08', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000),
(11, 48567, '2018-10-10', 'Samsung', 5000, '714524589', 3, 15000, 50000, 45000),
(20, 15, '2018-09-15', 'vipoos', 400000000, '764692427', 45, 20000000, 50000000, 2000000000),
(23, 456, '2018-10-02', 'Quvavy', 0, '764692425', 10, 5000, 50000, 50000),
(24, 12, '2018-09-19', 'nokia', -26000, '764692421', 2, 28000, 30000, 56000),
(45, 123, '2018-10-10', 'ert', 96, '771010101', 14, 2, 124, 28),
(47, 857, '2018-10-06', 'Samsung', 0, '764692427', 5, 5000, 25000, 25000),
(78, 4141, '2018-10-07', 'thnn', 500, '764692423', 1, 1500, 2000, 1500),
(85, 44, '2018-09-22', 'Oppo', 30, '777123456', 2, 10, 50, 20),
(87, 0, '2018-09-18', 'vipoosh', 5000, '764692421', 5, 5000, 30000, 25000),
(110, 48567, '2018-10-09', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000),
(124, 744, '2018-10-06', 'Samsung', 25, '764692241', 1, 25, 50, 25),
(127, 48567, '2018-10-08', 'Samsung', -1420000, '764692421', 10, 158000, 160000, 1580000),
(157, 200, '2018-10-06', 'Samsung', 1000, '764692478', 2, 1000, 3000, 2000),
(178, 48567, '2018-10-09', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000),
(201, 1568746, '2018-10-07', 'Samsung', -472000, '764692421', 10, 52500, 53000, 525000),
(252, 1414, '2018-10-06', 'Iphone', -220000, '764692421', 5, 50000, 30000, 250000),
(254, 1417, '2018-10-06', 'Iphone', -220000, '764692421', 5, 50000, 30000, 250000),
(414, 48567, '2018-10-08', 'Samsung', -1420000, '764692421', 10, 158000, 160000, 1580000),
(441, 1, '2018-10-07', '5yh5y', 1, '764696359', 1, 2000, 2001, 2000),
(474, 48567, '2018-10-08', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000),
(478, 784, '2018-10-06', 'Iphone', 45000, '764692487', 5, 1000, 50000, 5000),
(789, 65, '2018-10-06', 'Samsung', 150000, '764692421', 5, 10000, 200000, 50000),
(954, 487, '2018-10-06', 'Samsung', 0, '764692429', 5, 1000, 5000, 5000),
(1234, 4587, '2018-10-06', 'Samsung', 2500000, '764692425', 50, 50000, 5000000, 2500000),
(2025, 1568746, '2018-10-07', 'Samsung', -472000, '764692421', 10, 52500, 53000, 525000),
(2312, 123, '2018-10-10', 'adas', 988, '770077515', 12, 1, 1000, 12),
(4875, 1424, '2018-10-07', 'Samsung', -29000, '764692425', 4, 10000, 11000, 40000),
(7891, 65, '2018-10-06', 'Samsung', 150000, '764692421', 5, 10000, 200000, 50000),
(8784, 1245, '2018-10-07', 'yhh', 500, '764953588', 1, 48500, 49000, 48500),
(47474, 145, '2018-10-06', 'Nokia', 1000, '764698547', 1, 12000, 13000, 12000),
(200000, 48567, '2018-10-09', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000),
(1278451, 48567, '2018-10-08', 'Samsung', -1420000, '764692421', 10, 158000, 160000, 1580000),
(1278455, 48567, '2018-10-07', 'Samsung', -1420000, '764692421', 10, 158000, 160000, 1580000),
(22127845, 48567, '2018-10-08', 'Samsung', -1420000, '764692421', 10, 158000, 160000, 1580000),
(22554545, 48567, '2018-10-08', 'Samsung', -1420000, '764692421', 10, 158000, 160000, 1580000),
(47474747, 48567, '2018-10-08', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000),
(54545454, 12121212, '2018-10-07', 'gyugu', 500, '764692345', 1, 4500, 5000, 4500),
(89498498, 89, '2018-10-07', 'h355n', -112490, '764692427', 78, 1455, 1000, 113490),
(154786225, 48567, '2018-10-08', 'Samsung', 5000, '764692421', 3, 15000, 50000, 45000);

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `Supplier_Name` varchar(80) NOT NULL,
  `Supplier_ID` varchar(20) NOT NULL,
  `Address` varchar(80) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Email` varchar(80) NOT NULL,
  `Description` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`Supplier_Name`, `Supplier_ID`, `Address`, `Phone`, `Email`, `Description`) VALUES
('chanu', 'D001', 'china', '0717998779', 'chanu@mail.com', 'Retail');

-- --------------------------------------------------------

--
-- Table structure for table `test`
--

CREATE TABLE `test` (
  `Rid` int(10) NOT NULL,
  `name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_stock`
--
ALTER TABLE `add_stock`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `delivary`
--
ALTER TABLE `delivary`
  ADD PRIMARY KEY (`Cid`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`OrderID`);

--
-- Indexes for table `profit`
--
ALTER TABLE `profit`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `rejectitem`
--
ALTER TABLE `rejectitem`
  ADD PRIMARY KEY (`Rid`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `sales`
--
ALTER TABLE `sales`
  ADD PRIMARY KEY (`SalesID`);

--
-- Indexes for table `test`
--
ALTER TABLE `test`
  ADD PRIMARY KEY (`Rid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_stock`
--
ALTER TABLE `add_stock`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `delivary`
--
ALTER TABLE `delivary`
  MODIFY `Cid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `OrderID` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- AUTO_INCREMENT for table `rejectitem`
--
ALTER TABLE `rejectitem`
  MODIFY `Rid` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `salary`
--
ALTER TABLE `salary`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `test`
--
ALTER TABLE `test`
  MODIFY `Rid` int(10) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
