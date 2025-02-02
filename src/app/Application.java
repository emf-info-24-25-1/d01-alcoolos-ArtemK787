package app;

import app.ami.Ami;

public class Application {

        public static void main(String[] args) {
                // Création des amis avec des valeurs (bières réstantes) aléatoires

                Ami[] amis = {
                                new Ami("Dile Croco"),
                                new Ami("Pong Ping"),
                                new Ami("Dong Dong")
                };

                /*
                 * Affichage de l'état initial
                 * 
                 * J'a ajouté une boucle for pour afficher l'état de chacun des amis, qui va
                 * également vérifier si ils sont saoul. Si oui, on sort de la boucle et on
                 * affiche l'état final
                 */
                for (int i = 0; i < amis.length; i++) {
                        afficherSituation(amis[i]);
                }
                boolean estSaoul = false;
                while (!estSaoul) {
                        for (int i = 0; i < amis.length; i++) {
                                if (amis[i].getBieresRestantes() > 0) {
                                        amis[i].boitUneBiere();
                                } else if (estSaoul == false && amis[i].getBieresRestantes() == 0) {
                                        estSaoul = true;
                                        break;
                                }
                        }
                }

                // Affichage de l'état final
                for (int i = 0; i < amis.length; i++) {
                        afficherSituation(amis[i]);
                }

        }

        // Méthode pour afficher l'état d'un ami
        private static void afficherSituation(Ami ami) {
                if (ami.getBieresRestantes() == 0) {
                        System.out.println(ami.getName() + " n'a plus de bière à boire.");
                } else
                        System.out.println(
                                        ami.getName() + " peut encore boire " + ami.getBieresRestantes() + " bières.");
        }

}
