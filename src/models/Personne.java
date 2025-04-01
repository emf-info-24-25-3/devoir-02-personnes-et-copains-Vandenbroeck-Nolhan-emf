package models;

public class Personne {

    private final String nom;
    private final String prenom;
    private static final int MAX_COPAINS = 10;
    private Personne[] copains;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.copains = new Personne[MAX_COPAINS];
    }


    public String getPrenom() {
        return prenom;
    }

 
    public String getNom() {
        return nom;
    }


    public void tenterAjouterCopain(Personne copain) {
        for (int i = 0; i < copains.length; i++) {
            if (copains[i] == null) {
                copains[i] = copain;
                System.out.println(copain.getPrenom() + " " + copain.getNom() + " ajouté comme copain de " + prenom + " " + nom);
                return;
            }
        }
        System.out.println("Impossible d'ajouter " + copain.getPrenom() + " " + copain.getNom() + ": maximum de copains atteint.");
    }


    public void tenterSupprimerCopain(Personne copain) {
        for (int i = 0; i < copains.length; i++) {
            if (copains[i] == copain) {
                copains[i] = null; 
                System.out.println(copain.getPrenom() + " " + copain.getNom() + " supprimé de la liste des copains.");
                return;
            }
        }
        System.out.println(copain.getPrenom() + " " + copain.getNom() + " n'est pas un copain.");
    }


    @Override
    public String toString() {
        String resultat = prenom + " " + nom.toUpperCase() + " et ses copains ";


        boolean aCopains = false;
        for (Personne copain : copains) {
            if (copain != null) {
                if (!aCopains) {
                    resultat += "(" + copain.getPrenom() + " " + copain.getNom();
                    aCopains = true;
                } else {
                    resultat += ", " + copain.getPrenom() + " " + copain.getNom();
                }
            }
        }

        if (!aCopains) {
            resultat += "()";
        } else {
            resultat += ")";
        }

        return resultat;
    }
}
