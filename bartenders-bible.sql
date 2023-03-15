-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 15 mars 2023 à 08:10
-- Version du serveur : 5.7.40
-- Version de PHP : 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `bartenders-bible`
--

-- --------------------------------------------------------

--
-- Structure de la table `favorite`
--

DROP TABLE IF EXISTS `favorite`;
CREATE TABLE IF NOT EXISTS `favorite` (
  `id` bigint(20) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `recipeid` bigint(20) NOT NULL,
  `userid` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `favorite_recipes`
--

DROP TABLE IF EXISTS `favorite_recipes`;
CREATE TABLE IF NOT EXISTS `favorite_recipes` (
  `favorite_id` bigint(20) NOT NULL,
  `recipes_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_rm8254winfh943g9kblrduak3` (`recipes_id`),
  KEY `FKrd50f70md0jjp0v3psj86p20t` (`favorite_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `favorite_seq`
--

DROP TABLE IF EXISTS `favorite_seq`;
CREATE TABLE IF NOT EXISTS `favorite_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `favorite_seq`
--

INSERT INTO `favorite_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `favorite_users`
--

DROP TABLE IF EXISTS `favorite_users`;
CREATE TABLE IF NOT EXISTS `favorite_users` (
  `favorite_id` bigint(20) NOT NULL,
  `users_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_4fx12cqujfefya91ymflrtbca` (`users_id`),
  KEY `FKg2aiy461cjahs5dfakc5wxucp` (`favorite_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ingredient`
--

DROP TABLE IF EXISTS `ingredient`;
CREATE TABLE IF NOT EXISTS `ingredient` (
  `id` bigint(20) NOT NULL,
  `has_alcohol` bit(1) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ingredient_recipe`
--

DROP TABLE IF EXISTS `ingredient_recipe`;
CREATE TABLE IF NOT EXISTS `ingredient_recipe` (
  `ingredient_id` bigint(20) NOT NULL,
  `recipe_id` bigint(20) NOT NULL,
  KEY `FKqaihl4ckxrrpr33lcu6865rcl` (`recipe_id`),
  KEY `FKhlx76kitv08yj3x85mtxpkgpf` (`ingredient_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `ingredient_seq`
--

DROP TABLE IF EXISTS `ingredient_seq`;
CREATE TABLE IF NOT EXISTS `ingredient_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ingredient_seq`
--

INSERT INTO `ingredient_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `recipe`
--

DROP TABLE IF EXISTS `recipe`;
CREATE TABLE IF NOT EXISTS `recipe` (
  `id` bigint(20) NOT NULL,
  `date_add` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `estimated-time` bigint(20) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `favorite_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKa2uhi30pauxk8ux4d3oed8r10` (`favorite_id`),
  KEY `FK5mx01yw4j003wisa2aqmwir6l` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `recipe`
--

INSERT INTO `recipe` (`id`, `date_add`, `description`, `estimated-time`, `image`, `name`, `favorite_id`, `user_id`) VALUES
(1, NULL, NULL, NULL, 'C:/Users/Kévin/Desktop/Bartenders-Bible-angular-part-master/bar1/src/assets/body/mojito.jpg', 'mojito', NULL, NULL),
(2, NULL, NULL, NULL, 'C:/Users/Kévin/Desktop/Bartenders-Bible-angular-part-master/bar1/src/assets/body/sex-on-the-beach.jpg', 'virgin sex on the beach', NULL, NULL),
(3, NULL, NULL, NULL, 'C:/Users/Kévin/Desktop/Bartenders-Bible-angular-part-master/bar1/src/assets/body/cuba_libre.png', 'cuba libre', NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `recipe_ingredients`
--

DROP TABLE IF EXISTS `recipe_ingredients`;
CREATE TABLE IF NOT EXISTS `recipe_ingredients` (
  `recipe_id` bigint(20) NOT NULL,
  `ingredients_id` bigint(20) NOT NULL,
  KEY `FKg8ssng1dqiwgcptjptldels74` (`ingredients_id`),
  KEY `FKhnsmvxdlwxqq6x2wbgnoef5gr` (`recipe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `recipe_reviews`
--

DROP TABLE IF EXISTS `recipe_reviews`;
CREATE TABLE IF NOT EXISTS `recipe_reviews` (
  `recipe_id` bigint(20) NOT NULL,
  `reviews_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_8bc37x7ouepj5ncoajyix3dmx` (`reviews_id`),
  KEY `FK338u3s5ompids3mxmv7k5tps4` (`recipe_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `recipe_seq`
--

DROP TABLE IF EXISTS `recipe_seq`;
CREATE TABLE IF NOT EXISTS `recipe_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `recipe_seq`
--

INSERT INTO `recipe_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `review`
--

DROP TABLE IF EXISTS `review`;
CREATE TABLE IF NOT EXISTS `review` (
  `id` bigint(20) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `date` datetime(6) DEFAULT NULL,
  `rank` bigint(20) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `recipe_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9dqw7ep5rnww1yuimutvg4nny` (`recipe_id`),
  KEY `FK6cpw2nlklblpvc7hyt7ko6v3e` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `review_seq`
--

DROP TABLE IF EXISTS `review_seq`;
CREATE TABLE IF NOT EXISTS `review_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `review_seq`
--

INSERT INTO `review_seq` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` bigint(20) NOT NULL,
  `birthdate` datetime(6) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone` bigint(20) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `users_favorites`
--

DROP TABLE IF EXISTS `users_favorites`;
CREATE TABLE IF NOT EXISTS `users_favorites` (
  `user_id` bigint(20) NOT NULL,
  `favorites_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_9e8jc4picuo7soconil556rsw` (`favorites_id`),
  KEY `FKjkspbcfcy7pqc88p789pg50jm` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `users_reviews`
--

DROP TABLE IF EXISTS `users_reviews`;
CREATE TABLE IF NOT EXISTS `users_reviews` (
  `user_id` bigint(20) NOT NULL,
  `reviews_id` bigint(20) NOT NULL,
  UNIQUE KEY `UK_nwbr17s0jsngxjkc46al3yb21` (`reviews_id`),
  KEY `FKoxo5a0vly3llygwbrqxni9t10` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `users_seq`
--

DROP TABLE IF EXISTS `users_seq`;
CREATE TABLE IF NOT EXISTS `users_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `users_seq`
--

INSERT INTO `users_seq` (`next_val`) VALUES
(1);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `favorite_recipes`
--
ALTER TABLE `favorite_recipes`
  ADD CONSTRAINT `FK9l25i5usgn53r47t76cg5uisu` FOREIGN KEY (`recipes_id`) REFERENCES `recipe` (`id`),
  ADD CONSTRAINT `FKrd50f70md0jjp0v3psj86p20t` FOREIGN KEY (`favorite_id`) REFERENCES `favorite` (`id`);

--
-- Contraintes pour la table `favorite_users`
--
ALTER TABLE `favorite_users`
  ADD CONSTRAINT `FK2q3spxww01l3ev5shhtj0gf0e` FOREIGN KEY (`users_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKg2aiy461cjahs5dfakc5wxucp` FOREIGN KEY (`favorite_id`) REFERENCES `favorite` (`id`);

--
-- Contraintes pour la table `ingredient_recipe`
--
ALTER TABLE `ingredient_recipe`
  ADD CONSTRAINT `FKhlx76kitv08yj3x85mtxpkgpf` FOREIGN KEY (`ingredient_id`) REFERENCES `ingredient` (`id`),
  ADD CONSTRAINT `FKqaihl4ckxrrpr33lcu6865rcl` FOREIGN KEY (`recipe_id`) REFERENCES `recipe` (`id`);

--
-- Contraintes pour la table `recipe`
--
ALTER TABLE `recipe`
  ADD CONSTRAINT `FK5mx01yw4j003wisa2aqmwir6l` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FKa2uhi30pauxk8ux4d3oed8r10` FOREIGN KEY (`favorite_id`) REFERENCES `favorite` (`id`);

--
-- Contraintes pour la table `recipe_ingredients`
--
ALTER TABLE `recipe_ingredients`
  ADD CONSTRAINT `FKg8ssng1dqiwgcptjptldels74` FOREIGN KEY (`ingredients_id`) REFERENCES `ingredient` (`id`),
  ADD CONSTRAINT `FKhnsmvxdlwxqq6x2wbgnoef5gr` FOREIGN KEY (`recipe_id`) REFERENCES `recipe` (`id`);

--
-- Contraintes pour la table `recipe_reviews`
--
ALTER TABLE `recipe_reviews`
  ADD CONSTRAINT `FK338u3s5ompids3mxmv7k5tps4` FOREIGN KEY (`recipe_id`) REFERENCES `recipe` (`id`),
  ADD CONSTRAINT `FKncrlkqkyvbdsxbmqhtntmwi0e` FOREIGN KEY (`reviews_id`) REFERENCES `review` (`id`);

--
-- Contraintes pour la table `review`
--
ALTER TABLE `review`
  ADD CONSTRAINT `FK6cpw2nlklblpvc7hyt7ko6v3e` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  ADD CONSTRAINT `FK9dqw7ep5rnww1yuimutvg4nny` FOREIGN KEY (`recipe_id`) REFERENCES `recipe` (`id`);

--
-- Contraintes pour la table `users_favorites`
--
ALTER TABLE `users_favorites`
  ADD CONSTRAINT `FK26nr4aighs4v6imdxgmmtkugo` FOREIGN KEY (`favorites_id`) REFERENCES `favorite` (`id`),
  ADD CONSTRAINT `FKjkspbcfcy7pqc88p789pg50jm` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);

--
-- Contraintes pour la table `users_reviews`
--
ALTER TABLE `users_reviews`
  ADD CONSTRAINT `FK6a5sxjrvy9tyg9cak5hxewr1k` FOREIGN KEY (`reviews_id`) REFERENCES `review` (`id`),
  ADD CONSTRAINT `FKoxo5a0vly3llygwbrqxni9t10` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
