-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mar. 24 déc. 2019 à 00:38
-- Version du serveur :  10.1.37-MariaDB
-- Version de PHP :  7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionstock`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `nom` varchar(10) NOT NULL,
  `prenom` varchar(10) NOT NULL,
  `adresse` varchar(50) NOT NULL,
  `contact` int(11) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `code_postale` int(11) NOT NULL,
  `date` varchar(10) NOT NULL,
  `code_client` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`nom`, `prenom`, `adresse`, `contact`, `mail`, `code_postale`, `date`, `code_client`) VALUES
('njkhnj', 'jhjkh', 'kjhjk', 11111, 'jnjn', 1144, 'jknjknjn', 1),
('khalil', 'chaouali', 'daouar hicher', 96732246, 'khalilcaca5@gmail.com', 2086, '03/10/1997', 4),
('khalil', 'chaouali', '45lk', 96732246, 'khalilcail', 2086, '03/10/1997', 5);

-- --------------------------------------------------------

--
-- Structure de la table `commande`
--

CREATE TABLE `commande` (
  `Numero` int(11) NOT NULL,
  `Quantite` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Code_Client` int(11) NOT NULL,
  `Reference_Produit` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `commande`
--

INSERT INTO `commande` (`Numero`, `Quantite`, `Date`, `Code_Client`, `Reference_Produit`) VALUES
(1, 20, '2023-12-19', 4, '21e21');

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE `fournisseur` (
  `Numero` int(11) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `Nom` varchar(20) NOT NULL,
  `Code_Postale` int(11) NOT NULL,
  `Fax` int(11) NOT NULL,
  `Ville` varchar(30) NOT NULL,
  `Mail` varchar(50) NOT NULL,
  `Téléphone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fournisseur`
--

INSERT INTO `fournisseur` (`Numero`, `Adresse`, `Nom`, `Code_Postale`, `Fax`, `Ville`, `Mail`, `Téléphone`) VALUES
(1, 'nbmn', 'nbmn', 5454, 54454546, 'jkhjkhj', 'kjkljs', 45646544),
(2, 'ibn rachiq', 'hatem', 4568, 72656666, 'mabouab', 'khalilcaca5@gmail.com', 96452456);

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

CREATE TABLE `login` (
  `id` int(11) NOT NULL,
  `user` varchar(10) NOT NULL,
  `pass` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `login`
--

INSERT INTO `login` (`id`, `user`, `pass`) VALUES
(1, 'khalil', 'chaouali');

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

CREATE TABLE `produit` (
  `Reference` varchar(11) NOT NULL,
  `Designation` varchar(11) NOT NULL,
  `Categorie` varchar(11) NOT NULL,
  `Marque` varchar(11) NOT NULL,
  `Quantite` int(11) NOT NULL,
  `Prix` int(11) NOT NULL,
  `numf` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`Reference`, `Designation`, `Categorie`, `Marque`, `Quantite`, `Prix`, `numf`) VALUES
('21e21', 'ksk', 'Clavier', 'Asus', 50, 10000, 1),
('dee22', 'jnxjnd', 'souris', 'Sony', 20, 2000, 2);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`code_client`);

--
-- Index pour la table `commande`
--
ALTER TABLE `commande`
  ADD PRIMARY KEY (`Numero`),
  ADD KEY `Code_Client` (`Code_Client`),
  ADD KEY `Reference_Produit` (`Reference_Produit`);

--
-- Index pour la table `fournisseur`
--
ALTER TABLE `fournisseur`
  ADD PRIMARY KEY (`Numero`);

--
-- Index pour la table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `produit`
--
ALTER TABLE `produit`
  ADD PRIMARY KEY (`Reference`),
  ADD KEY `numf` (`numf`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `commande`
--
ALTER TABLE `commande`
  MODIFY `Numero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `commande`
--
ALTER TABLE `commande`
  ADD CONSTRAINT `commande_ibfk_1` FOREIGN KEY (`Code_Client`) REFERENCES `client` (`code_client`),
  ADD CONSTRAINT `commande_ibfk_2` FOREIGN KEY (`Reference_Produit`) REFERENCES `produit` (`Reference`);

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `produit_ibfk_1` FOREIGN KEY (`numf`) REFERENCES `fournisseur` (`Numero`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
