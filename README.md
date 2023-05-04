# Backend Gestionnaire de ticket

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](https://forthebadge.com) [![forthebadge](https://forthebadge.com/images/badges/made-with-javascript.svg)](https://forthebadge.com)

<!-- Table des matières -->
## Table des matières

- [Table des matières](#table-des-matières)

- [À propos du projet](#à-propos-du-projet)

- [Technologies utilisées](#technologies-utilisées)

- [Pour commencer](#pour-commencer)

  - [Prérequis](#pré-requis)

  - [Démarrage](#démarrage)

  - [Principes de fonctionnement](#principes-de-fonctionnement)
  
- [Documentation de l'API](https://documenter.getpostman.com/view/25189655/2s93eVYEd5)

- [Auteurs](#auteurs)

- [License](#license)

## À propos du projet

L'objectif du projet est de mettre en applicatioon nos différentes connaissances acquises au travers du cours de SIR.  
Il s'agit de la mise en place d'une version reduite d'un gestionnaire de tickets. Nous avons ici la partie backend du projet.

## Technologies utilisées

* [Tailwind CSS](https://tailwindcss.com/) - Framework CSS (front-end)
* [Vue JS](https://vuejs.org/) - Framework JavaScript utilisé pour le frontend
* [Jpa + JAX-RS] - Technoligie utilisé pour le backend


## Pour commencer

### Pré-requis

Il est requis d'installer:

- Node.js version 16.0 ou plus
- JDK 1.8 ou plus
-  Maven 3.2+ 
- Un serveur MySQL

### Démarrage

Une fois tous les prérequis respectés, et le projet cloné:

- Allez dans le fichier *persistence.xml* pour modifier la base de données,  le nom d'utilisateur, le mot de passe ..., selon ce que votre configuration MySQL comporte.
- Après buildez le projet en utilisant maven (dépendances, compilation ..)
- Pour terminer lancer le server jaxrs *RestServer.java*.

Dans une autre console il faudrait lancer l'application le frontend se trouvant [ici](https://github.com/alexandrapadonou/frontEndSIR).

### Principes de fonctionnement

Afin de pré-remplir la base de données, nous avons crée un endpoint */api/fill/database*. Au lancemenet du projet il est donc conseiller de faire un get sur cet endpoint avant de pourvoir parcourir le projet.

Vous pouvez également run le fichier *JpaTest.java* pour pré-remplir la base de données


## Auteurs
* **Lokonon Bignon M Souvenir** 
* **Padonou Alexandra Epiphanie** 


