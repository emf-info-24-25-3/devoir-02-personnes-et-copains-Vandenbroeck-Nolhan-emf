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

        public void tenterAjouterCopain(Personne copain) {
                boolean estPresent = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == null & estPresent == false) {
                                copains[i] = copain;
                                System.out.println("Ajout de l'ami : " + copain.getPrenom() + " " + copain);

                        }
                }

        }

        public void tenterSupprimerCopain(Personne copain) {
                boolean estPresent = false;
                boolean aDesCopains = false;
                for (int i = 0; i < copains.length; i++) {
                        if (copains[i] == copain) {
                                estPresent = true;
                                aDesCopains = true;
                                break;
                        } else if (copains[i] != null) {

                                aDesCopains = true;
                        }

                }
        }
        public String toString() {
                String formulation prenom + " " + nom.toUpperCase()+ " "
        }
}
