package app;

import models.Personne;

public class Application {
    public static void main(String[] args) {

        Personne personne1 = new Personne("TERRIEUR", "Alex");
        Personne personne2 = new Personne("HARONI", "Mac");
        Personne personne3 = new Personne("D'OEUF", "John");


        personne1.tenterAjouterCopain(personne2);
        personne1.tenterAjouterCopain(personne3);

        System.out.println(personne1); 
        System.out.println(personne2); 
        System.out.println(personne3);  

        personne1.tenterSupprimerCopain(personne2);

        
        System.out.println(personne1);
    }
}
