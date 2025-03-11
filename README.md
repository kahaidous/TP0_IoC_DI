# Projet de Démonstration Spring Core

## Aperçu
Il s'agit d'une application simple démontrant l'injection de dépendances et la gestion des beans avec Spring Core. 
Ce projet sert d'exemple pédagogique pour illustrer les concepts fondamentaux du framework Spring, notamment l'utilisation du conteneur IoC (Inversion of Control).

## Structure du Projet
- Les packages `dao` et `metier` contiennent probablement des interfaces (`IDao`, `ICalcul`) et leurs implémentations, configurées dans le fichier `config.xml`.
- La configuration est gérée via une approche basée sur XML, reflétant une configuration traditionnelle de Spring Core.
- Notez qu'il n'existe aucune base de données derrière, seulement une simulation.

## Objectif
Ce projet est conçu pour aider les développeurs à comprendre :
- Comment configurer des beans à l'aide d'un fichier de configuration XML (`config.xml`).
- L'implémentation de l'injection de dépendances entre les composants.
- L'initialisation et l'utilisation du conteneur IoC de Spring.

## Démarrage
Pour explorer ou exécuter ce projet :
1. Assurez-vous d'avoir Java 17+ et Maven installés.
2. Importez le projet dans IntelliJ IDEA.
3. Exécutez la classe `Main` située dans le package `org.example` pour voir l'application en action.

## Configuration
Le fichier `config.xml` dans `src/main/resources` définit les beans et leurs dépendances, tels que :
- Un bean `data`.
- Un bean `calcul`, avec une dépendance vers `data`).

## Contributions
N'hésitez pas à forker ce dépôt, à apporter des améliorations et à soumettre des pull requests. Toute rétroaction ou suggestion est la bienvenue !
