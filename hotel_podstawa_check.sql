-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 19 Lis 2020, 20:25
-- Wersja serwera: 10.4.11-MariaDB
-- Wersja PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `hotel_podstawa`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `goscie`
--

CREATE TABLE `goscie` (
  `nr_rezerwacji` varchar(6) NOT NULL,
  `nr_pokoju` int(3) NOT NULL,
  `pesel` char(11) NOT NULL,
  `imie` text DEFAULT NULL,
  `nazwisko` text DEFAULT NULL
) ;

--
-- Zrzut danych tabeli `goscie`
--

INSERT INTO `goscie` (`nr_rezerwacji`, `nr_pokoju`, `pesel`, `imie`, `nazwisko`) VALUES
('0015-A', 303, '31040663889', 'Jadzia', 'Michalska'),
('0018-X', 203, '35414107745', 'Kornel', 'Szynski'),
('0015-A', 303, '41011400698', 'Maksym', 'Dudek'),
('0018-X', 203, '41112499306', 'Asia', 'Duda'),
('0014-B', 105, '45082076165', 'Dominika', 'Dabrowski'),
('0007-Q', 106, '51031098597', 'Wincenty', 'Kwiatkowski'),
('0025-C', 206, '54041367873', 'Wojciech', 'Chmielewski'),
('0041-D', 104, '55111421114', 'Maurycy', 'Jablonski'),
('0005-G', 306, '60111060906', 'Malwina', 'Nowicka'),
('0031-V', 103, '62092706881', 'Witold', 'Rak'),
('0016-F', 201, '63012412236', 'Wlodzimierz', 'Wysocki'),
('0021-G', 205, '67072267441', 'Wiola', 'Jasinska'),
('0001-A', 102, '72071318081', 'Waleria', 'Tomaszewska'),
('0007-Q', 106, '72082398122', 'Boleslawa', 'Walczak'),
('0014-B', 105, '74060229839', 'Wlodzimierz', 'Dabrowski'),
('0018-K', 305, '75051146489', 'Lucja', 'Jaworska'),
('0145-A', 202, '76121810251', 'Sylwester', 'Zajac'),
('0016-F', 201, '81101120660', 'Lechoslawa', 'Michalska'),
('0016-F', 204, '82032644449', 'Klaudia', 'Zielinska'),
('0145-A', 202, '84012518753', 'Bolek', 'Kozlowski'),
('0001-A', 102, '84040305271', 'Jan', 'Drobnowski'),
('0005-G', 306, '85022005334', 'Tatyana', 'Abramova'),
('2367-D', 101, '85111105693', 'Karol', 'Miszczak'),
('0016-F', 204, '86020501071', 'Walenty', 'Jasinski'),
('0031-V', 103, '87112667499', 'Sylwester', 'Czarnecki'),
('0021-I', 205, '87121205763', 'Anna', 'Jablonska'),
('0002-A', 101, '88050527209', 'Maryla', 'Kalinowska'),
('0025-C', 206, '89011583465', 'Jagoda', 'Nowak'),
('0007-Q', 106, '90031211234', 'Monika', 'Drab'),
('0014-B', 105, '94061182342', 'Jaroslawa', 'Kowalska');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kary`
--

CREATE TABLE `kary` (
  `liczba_porzadkowa` bigint(10) UNSIGNED NOT NULL,
  `nr_rezerwacji` varchar(6) NOT NULL,
  `nr_pokoju` int(3) DEFAULT NULL,
  `kod` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `kary`
--

INSERT INTO `kary` (`liczba_porzadkowa`, `nr_rezerwacji`, `nr_pokoju`, `kod`) VALUES
(1, '0145-A', 202, 'SIL'),
(2, '0007-Q', 106, 'KEY');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `kary_info`
--

CREATE TABLE `kary_info` (
  `kod` varchar(3) NOT NULL,
  `naleznosc` decimal(7,2) NOT NULL,
  `opis` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `kary_info`
--

INSERT INTO `kary_info` (`kod`, `naleznosc`, `opis`) VALUES
('KEY', '30.00', 'Zagubienie klucza do pokoju'),
('LAT', '20.00', 'Nie opuszczenie pokoju na czas'),
('SIL', '50.00', 'Nie przestrzeganie ciszy nocnej');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `platnosci`
--

CREATE TABLE `platnosci` (
  `nr_rezerwacji` varchar(6) NOT NULL,
  `do_zaplaty` decimal(7,2) DEFAULT NULL,
  `email` text NOT NULL
) ;

--
-- Zrzut danych tabeli `platnosci`
--

INSERT INTO `platnosci` (`nr_rezerwacji`, `do_zaplaty`, `email`) VALUES
('0001-A', NULL, 'drobnowski.jan@gmail.com'),
('0002-A', NULL, 'marylakalinowska@gmail.com'),
('0005-G', NULL, 'handball_russia@gmail.com'),
('0007-Q', NULL, 'monika_drab@wp.pl'),
('0014-B', NULL, 'dominikadab111@o2.pl'),
('0015-A', NULL, 'maks0314@gmail.com'),
('0016-F', NULL, 'wlodek_wysoki@interia.pl'),
('0018-K', NULL, 'jaworskalucja@gmail.com'),
('0018-X', NULL, 'kornelszynski@o2.pl'),
('0021-G', NULL, 'wiola.jasinska@wp.pl'),
('0021-I', NULL, 'ania389@gmail.com'),
('0025-C', NULL, 'jagodka43@poczta.onet.pl'),
('0031-V', NULL, 'witold_rak@yahoo.com'),
('0041-D', NULL, 'maurycyyy@wp.pl'),
('0145-A', NULL, 'koziol876@wp.pl'),
('2367-D', NULL, 'karol.miszczak@o2.pl');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `platnosc_pokoje`
--

CREATE TABLE `platnosc_pokoje` (
  `nr_rezerwacji` varchar(6) DEFAULT NULL,
  `nr_pokoju` int(3) DEFAULT NULL,
  `poczatek` date DEFAULT NULL,
  `koniec` date DEFAULT NULL,
  `cena` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `platnosc_uslugi`
--

CREATE TABLE `platnosc_uslugi` (
  `nr_rezerwacji` varchar(6) DEFAULT NULL,
  `imie` text DEFAULT NULL,
  `nazwisko` text DEFAULT NULL,
  `kod` varchar(3) DEFAULT NULL,
  `cena` decimal(7,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `pokoje`
--

CREATE TABLE `pokoje` (
  `nr_pokoju` int(3) NOT NULL,
  `rodzaj` varchar(12) NOT NULL,
  `dla_ilu_osob` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `pokoje`
--

INSERT INTO `pokoje` (`nr_pokoju`, `rodzaj`, `dla_ilu_osob`) VALUES
(206, 'Apartament', 2),
(306, 'Apartament', 2),
(104, 'Lux', 2),
(201, 'Lux', 2),
(204, 'Lux', 2),
(304, 'Lux', 2),
(302, 'Lux', 3),
(101, 'Standard', 1),
(305, 'Standard', 1),
(102, 'Standard', 2),
(103, 'Standard', 2),
(202, 'Standard', 2),
(203, 'Standard', 2),
(205, 'Standard', 2),
(301, 'Standard', 2),
(303, 'Standard', 2),
(105, 'Standard', 3),
(106, 'Standard', 3);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `pokoje_info`
--

CREATE TABLE `pokoje_info` (
  `rodzaj` varchar(12) NOT NULL,
  `dla_ilu_osob` int(2) NOT NULL,
  `cena` decimal(7,2) DEFAULT NULL,
  `opis` text DEFAULT NULL
) ;

--
-- Zrzut danych tabeli `pokoje_info`
--

INSERT INTO `pokoje_info` (`rodzaj`, `dla_ilu_osob`, `cena`, `opis`) VALUES
('Apartament', 2, '360.00', '2-osobowy z wlasna lazienka, TV, kuchnia, sejf, balkon, wifi'),
('Lux', 2, '280.00', '2-osobowy z wlasna lazienka, TV, lodowka, balkon, wifi'),
('Lux', 3, '320.00', '3-osobowy z wlasna lazienka, TV, lodowka, balkon, wifi'),
('Standard', 1, '110.00', '1-osobowy bez lazienki, TV, woda mineralna, wifi'),
('Standard', 2, '180.00', '2-osobowy bez lazienki, TV, woda mineralna, wifi'),
('Standard', 3, '230.00', '3-osobowy bez lazienki, TV, woda mineralna, wifi');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `przydzial_rabaty`
--

CREATE TABLE `przydzial_rabaty` (
  `nr_rezerwacji` varchar(6) DEFAULT NULL,
  `kod` varchar(3) DEFAULT NULL,
  `wysokosc_rabatu` decimal(3,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `rabaty`
--

CREATE TABLE `rabaty` (
  `nr_rezerwacji` varchar(6) NOT NULL,
  `kod` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `rabaty`
--

INSERT INTO `rabaty` (`nr_rezerwacji`, `kod`) VALUES
('0001-A', 'NXT'),
('0005-G', 'WCZ'),
('0016-F', 'OFS'),
('0018-X', 'OFS'),
('0031-V', 'OFS'),
('0145-A', 'OFS');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `rabaty_info`
--

CREATE TABLE `rabaty_info` (
  `kod` varchar(3) NOT NULL,
  `wysokosc_rabatu` decimal(3,2) DEFAULT NULL,
  `opis` text DEFAULT NULL
) ;

--
-- Zrzut danych tabeli `rabaty_info`
--

INSERT INTO `rabaty_info` (`kod`, `wysokosc_rabatu`, `opis`) VALUES
('GRP', '0.10', 'Grupy conajmniej 8-osobowe.'),
('NXT', '0.05', 'Kolejny pobyt.'),
('OFS', '0.15', 'Pobyt pozasezownowy: listopad-luty.'),
('WCZ', '0.05', 'Rezerwacja z conajmniej 30 dniowym wyprzedzeniem.');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `rezerwacje`
--

CREATE TABLE `rezerwacje` (
  `nr_rezerwacji` varchar(6) NOT NULL,
  `nr_pokoju` int(3) NOT NULL,
  `poczatek` date DEFAULT NULL,
  `koniec` date DEFAULT NULL
) ;

--
-- Zrzut danych tabeli `rezerwacje`
--

INSERT INTO `rezerwacje` (`nr_rezerwacji`, `nr_pokoju`, `poczatek`, `koniec`) VALUES
('0001-A', 102, '2014-03-12', '2014-03-15'),
('0002-A', 101, '2014-03-15', '2014-03-18'),
('0005-G', 306, '2014-03-04', '2014-03-13'),
('0007-Q', 106, '2014-03-02', '2014-03-06'),
('0014-B', 105, '2014-03-01', '2014-03-10'),
('0015-A', 303, '2014-04-01', '2014-04-03'),
('0016-F', 201, '2014-02-07', '2014-02-15'),
('0016-F', 204, '2014-02-07', '2014-02-15'),
('0018-K', 305, '2014-03-12', '2014-03-15'),
('0018-X', 203, '2014-02-22', '2014-02-26'),
('0021-G', 205, '2014-04-20', '2014-04-27'),
('0021-I', 205, '2014-03-10', '2014-03-11'),
('0025-C', 206, '2014-04-10', '2014-04-20'),
('0031-V', 103, '2014-02-25', '2014-02-27'),
('0041-D', 104, '2014-01-30', '2014-02-05'),
('0145-A', 202, '2014-02-04', '2014-02-10'),
('2367-D', 101, '2014-03-19', '2014-03-20');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `uslugi`
--

CREATE TABLE `uslugi` (
  `liczba_porzadkowa` bigint(10) UNSIGNED NOT NULL,
  `pesel` char(11) NOT NULL,
  `kod` varchar(3) NOT NULL,
  `data` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `uslugi`
--

INSERT INTO `uslugi` (`liczba_porzadkowa`, `pesel`, `kod`, `data`) VALUES
(1, '87121205763', 'SND', '2014-03-10'),
(2, '87121205763', 'SND', '2014-03-11'),
(3, '74060229839', 'LOT', '2014-03-01'),
(4, '74060229839', 'LOT', '2014-03-10'),
(5, '88050527209', 'PET', '2014-03-15'),
(6, '88050527209', 'PET', '2014-03-15'),
(7, '75051146489', 'P', '2014-03-12'),
(8, '75051146489', 'P', '2014-03-13'),
(9, '75051146489', 'P', '2014-03-14'),
(10, '75051146489', 'P', '2014-03-15'),
(11, '90031211234', 'DZ', '2014-03-02'),
(12, '90031211234', 'DZ', '2014-03-03'),
(13, '90031211234', 'DZ', '2014-03-04'),
(14, '90031211234', 'DZ', '2014-03-05'),
(15, '90031211234', 'DZ', '2014-03-06'),
(16, '35414107745', 'SND', '2014-02-22'),
(17, '35414107745', 'SND', '2014-02-23'),
(18, '35414107745', 'SND', '2014-02-24'),
(19, '35414107745', 'SND', '2014-02-25'),
(20, '35414107745', 'SND', '2014-02-26'),
(21, '41112499306', 'SND', '2014-02-22'),
(22, '41112499306', 'SND', '2014-02-23'),
(23, '41112499306', 'SND', '2014-02-24'),
(24, '41112499306', 'SND', '2014-02-25'),
(25, '41112499306', 'SND', '2014-02-26'),
(26, '41011400698', 'P', '2014-04-01'),
(27, '41011400698', 'P', '2014-04-02'),
(28, '41011400698', 'P', '2014-04-03'),
(29, '31040663889', 'DZ', '2014-04-01'),
(30, '31040663889', 'DZ', '2014-04-02'),
(31, '31040663889', 'DZ', '2014-04-03'),
(32, '62092706881', 'LOT', '2014-02-25'),
(33, '62092706881', 'LOT', '2014-02-27'),
(34, '85111105693', 'SND', '2014-03-20');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `uslugi_info`
--

CREATE TABLE `uslugi_info` (
  `kod` varchar(3) NOT NULL,
  `cena` decimal(7,2) NOT NULL,
  `opis` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `uslugi_info`
--

INSERT INTO `uslugi_info` (`kod`, `cena`, `opis`) VALUES
('DZ', '10.00', 'Dostawienie lozeczka dla malych dzieci'),
('LOT', '20.00', 'Transport z i na lotnisko.'),
('P', '25.00', 'Parking strzezony 24h.'),
('PET', '23.00', 'Mozliwosc pobytu z wlasnym zwierzeciem'),
('SND', '15.00', 'Sniadanie w formie bufetu.');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `goscie`
--
ALTER TABLE `goscie`
  ADD PRIMARY KEY (`pesel`),
  ADD KEY `nr_rezerwacji` (`nr_rezerwacji`,`nr_pokoju`);

--
-- Indeksy dla tabeli `kary`
--
ALTER TABLE `kary`
  ADD PRIMARY KEY (`liczba_porzadkowa`),
  ADD UNIQUE KEY `liczba_porzadkowa` (`liczba_porzadkowa`) USING BTREE,
  ADD KEY `kod` (`kod`),
  ADD KEY `nr_rezerwacji` (`nr_rezerwacji`,`nr_pokoju`);

--
-- Indeksy dla tabeli `kary_info`
--
ALTER TABLE `kary_info`
  ADD PRIMARY KEY (`kod`);

--
-- Indeksy dla tabeli `platnosci`
--
ALTER TABLE `platnosci`
  ADD PRIMARY KEY (`nr_rezerwacji`);

--
-- Indeksy dla tabeli `pokoje`
--
ALTER TABLE `pokoje`
  ADD PRIMARY KEY (`nr_pokoju`),
  ADD KEY `rodzaj` (`rodzaj`,`dla_ilu_osob`);

--
-- Indeksy dla tabeli `pokoje_info`
--
ALTER TABLE `pokoje_info`
  ADD PRIMARY KEY (`rodzaj`,`dla_ilu_osob`);

--
-- Indeksy dla tabeli `rabaty`
--
ALTER TABLE `rabaty`
  ADD PRIMARY KEY (`nr_rezerwacji`,`kod`),
  ADD KEY `kod` (`kod`);

--
-- Indeksy dla tabeli `rabaty_info`
--
ALTER TABLE `rabaty_info`
  ADD PRIMARY KEY (`kod`);

--
-- Indeksy dla tabeli `rezerwacje`
--
ALTER TABLE `rezerwacje`
  ADD PRIMARY KEY (`nr_rezerwacji`,`nr_pokoju`),
  ADD KEY `nr_pokoju` (`nr_pokoju`);

--
-- Indeksy dla tabeli `uslugi`
--
ALTER TABLE `uslugi`
  ADD PRIMARY KEY (`liczba_porzadkowa`),
  ADD UNIQUE KEY `liczba_porzadkowa` (`liczba_porzadkowa`) USING BTREE,
  ADD KEY `kod` (`kod`),
  ADD KEY `pesel` (`pesel`);

--
-- Indeksy dla tabeli `uslugi_info`
--
ALTER TABLE `uslugi_info`
  ADD PRIMARY KEY (`kod`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `kary`
--
ALTER TABLE `kary`
  MODIFY `liczba_porzadkowa` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT dla tabeli `uslugi`
--
ALTER TABLE `uslugi`
  MODIFY `liczba_porzadkowa` bigint(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `goscie`
--
ALTER TABLE `goscie`
  ADD CONSTRAINT `goscie_ibfk_1` FOREIGN KEY (`nr_rezerwacji`,`nr_pokoju`) REFERENCES `rezerwacje` (`nr_rezerwacji`, `nr_pokoju`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ograniczenia dla tabeli `kary`
--
ALTER TABLE `kary`
  ADD CONSTRAINT `kary_ibfk_1` FOREIGN KEY (`kod`) REFERENCES `kary_info` (`kod`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kary_ibfk_2` FOREIGN KEY (`nr_rezerwacji`,`nr_pokoju`) REFERENCES `rezerwacje` (`nr_rezerwacji`, `nr_pokoju`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ograniczenia dla tabeli `pokoje`
--
ALTER TABLE `pokoje`
  ADD CONSTRAINT `pokoje_ibfk_1` FOREIGN KEY (`rodzaj`,`dla_ilu_osob`) REFERENCES `pokoje_info` (`rodzaj`, `dla_ilu_osob`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ograniczenia dla tabeli `rabaty`
--
ALTER TABLE `rabaty`
  ADD CONSTRAINT `rabaty_ibfk_1` FOREIGN KEY (`nr_rezerwacji`) REFERENCES `platnosci` (`nr_rezerwacji`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rabaty_ibfk_2` FOREIGN KEY (`kod`) REFERENCES `rabaty_info` (`kod`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ograniczenia dla tabeli `rezerwacje`
--
ALTER TABLE `rezerwacje`
  ADD CONSTRAINT `rezerwacje_ibfk_1` FOREIGN KEY (`nr_rezerwacji`) REFERENCES `platnosci` (`nr_rezerwacji`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `rezerwacje_ibfk_2` FOREIGN KEY (`nr_pokoju`) REFERENCES `pokoje` (`nr_pokoju`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Ograniczenia dla tabeli `uslugi`
--
ALTER TABLE `uslugi`
  ADD CONSTRAINT `uslugi_ibfk_1` FOREIGN KEY (`kod`) REFERENCES `uslugi_info` (`kod`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `uslugi_ibfk_2` FOREIGN KEY (`pesel`) REFERENCES `goscie` (`pesel`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
