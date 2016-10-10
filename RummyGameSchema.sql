SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE database rummy; 

use rummy;

--
-- Database: `rummy`
--

-- --------------------------------------------------------

--
-- Table structure for table `game`
--

CREATE TABLE `game` (
  `game_id` int(11) NOT NULL,
  `player_id_1` int(11) NOT NULL,
  `player_id_2` int(11) NOT NULL,
  `player_Id_3` int(11) NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `game_start` timestamp NULL DEFAULT NULL,
  `game_end` timestamp NULL DEFAULT NULL,
  `status` varchar(22) NOT NULL,
  `game_result` varchar(233) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `game_cards`
--

CREATE TABLE `game_cards` (
  `game_id` int(11) NOT NULL,
  `player_id` int(11) NOT NULL,
  `card_id` varchar(20) NOT NULL,
  `card_index` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `invite`
--

CREATE TABLE `invite` (
  `invite_id` int(11) NOT NULL,
  `req_player_id` int(11) NOT NULL,
  `rec_player_id` int(11) NOT NULL DEFAULT '0',
  `game_id` int(11) NOT NULL,
  `status` varchar(40) NOT NULL DEFAULT 'FRESH',
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `start_time` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `player`
--

CREATE TABLE `player` (
  `player_id` int(11) NOT NULL,
  `player_name` varchar(100) NOT NULL,
  `games_played` int(11) NOT NULL DEFAULT '0',
  `score` int(11) NOT NULL DEFAULT '0',
  `created_time` varchar(100) NOT NULL,
  `email` varchar(199) NOT NULL,
  `password` varchar(299) NOT NULL,
  `status` varchar(80) NOT NULL,
  `type` varchar(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Table structure for table `round`
--

CREATE TABLE `round` (
  `round_id` int(11) NOT NULL,
  `game_id` int(11) NOT NULL,
  `player_on_turn` int(11) NOT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `game`
--
ALTER TABLE `game`
  ADD PRIMARY KEY (`game_id`);

--
-- Indexes for table `invite`
--
ALTER TABLE `invite`
  ADD PRIMARY KEY (`invite_id`),
  ADD KEY `idx` (`game_id`);

--
-- Indexes for table `player`
--
ALTER TABLE `player`
  ADD PRIMARY KEY (`player_id`);

--
-- Indexes for table `round`
--
ALTER TABLE `round`
  ADD PRIMARY KEY (`round_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `game`
--
ALTER TABLE `game`
  MODIFY `game_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `invite`
--
ALTER TABLE `invite`
  MODIFY `invite_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `player`
--
ALTER TABLE `player`
  MODIFY `player_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `round`
--
ALTER TABLE `round`
  MODIFY `round_id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
