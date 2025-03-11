package org.example;

import org.example.dao.IDao;
import org.example.metier.ICalcul;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /******
         * ApplicationContext: un environnement d’exécution qui gère la création, la configuration, et l’injection des beans..
         *
         * ClassPathXmlApplicationContext: Implémentation de "ApplicationContext", il est responsable sur le chargement
         * de la configuration des beans à partir d’un ou plusieurs fichiers XML situés dans le répertoire resources.
         *
         * AnnotationConfigApplicationContext: Implémentation de "ApplicationContext", qui charge la configuration des beans
         * à partir de classes Java annotées @Configuration et @Bean ...
         *
         */

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        IDao sql = (IDao) applicationContext.getBean("data");
        System.out.println(sql.getData());
        ICalcul calcul = (ICalcul) applicationContext.getBean("calcul");
        System.out.println(calcul.calculer());
     }
}