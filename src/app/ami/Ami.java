package app.ami;

public class Ami {

    // Constantes
    private static final int MIN_BIERES = 2;
    private static final int MAX_BIERES = 10;

    // Attributs
    private final String name;
    private int bieresRestantes;

    // Constructeur
    public Ami(String name) {
        this.name = name;
        this.bieresRestantes = (int) (Math.random() * (MAX_BIERES - MIN_BIERES + 1)) + MIN_BIERES;
    }
    
    // Méthode pour boire une bière
    public void boitUneBiere() {
        if (bieresRestantes > 0) {
            bieresRestantes--;
            System.out.println(name + " a bu une bière. Il lui reste " + bieresRestantes + " bières.");
        } else {
            System.out.println(name + " est déjà saoul !");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBieresRestantes() {
        return bieresRestantes;
    }
}

