
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author zouhaib mahamoud
 */
public class tete_du_jeu_zouhaib {

    private static final int NB_CHIFFRES = 4;

    private final int[] combinaisonSecrete = new int[NB_CHIFFRES];
    private final int[] proposition = new int[NB_CHIFFRES];

    private final int nbTentativesMax = 5;
    private int nbTentatives = 0;
    private boolean gagne = false;

    public tete_du_jeu_zouhaib() {
        nouvellePartie();
    }

    // -----------------------------------------------------------------
    //      GESTION DE LA PARTIE
    // -----------------------------------------------------------------

    public void nouvellePartie() {
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < NB_CHIFFRES; i++) {
            combinaisonSecrete[i] = r.nextInt(10);  // 0..9
            proposition[i] = 0;                     // chiffres affichés au début
        }
        nbTentatives = 0;
        gagne = false;

        // Pour déboguer, tu peux décommenter :
        // System.out.println("Secret = " + java.util.Arrays.toString(combinaisonSecrete));
    }

    // -----------------------------------------------------------------
    //      GESTION DES CHIFFRES AFFICHÉS (proposition du joueur)
    // -----------------------------------------------------------------

    public void incrementerChiffre(int index) {
        if (index < 0 || index >= NB_CHIFFRES) return;
        proposition[index] = (proposition[index] + 1) % 10; // 0..9
    }

    public void decrementerChiffre(int index) {
        if (index < 0 || index >= NB_CHIFFRES) return;
        proposition[index] = (proposition[index] + 9) % 10; // -1 → 9
    }

    public int getProposition(int index) {
        if (index < 0 || index >= NB_CHIFFRES) return 0;
        return proposition[index];
    }

    // -----------------------------------------------------------------
    //      TEST DE LA PROPOSITION
    // -----------------------------------------------------------------

    public Resultat tester() {
        if (partieTerminee()) {
            return new Resultat(0, 0, 0);
        }

        nbTentatives++;

        int nbExact = 0;
        int nbTropHaut = 0;
        int nbTropBas = 0;

        for (int i = 0; i < NB_CHIFFRES; i++) {
            int secret = combinaisonSecrete[i];
            int val = proposition[i];

            if (val == secret) {
                nbExact++;
            } else if (val > secret) {
                nbTropHaut++;
            } else {
                nbTropBas++;
            }
        }

        if (nbExact == NB_CHIFFRES) {
            gagne = true;
        }

        return new Resultat(nbExact, nbTropHaut, nbTropBas);
    }

    // -----------------------------------------------------------------
    //      INFOS POUR L'IHM
    // -----------------------------------------------------------------

    public boolean estGagne() {
        return gagne;
    }

    public boolean partieTerminee() {
        return gagne || nbTentatives >= nbTentativesMax;
    }

    public int getNbTentatives() {
        return nbTentatives;
    }

    public int getNbTentativesMax() {
        return nbTentativesMax;
    }

    // -----------------------------------------------------------------
    //      CLASSE RESULTAT
    // -----------------------------------------------------------------

    public static class Resultat {
        private final int nbExact;
        private final int nbTropHaut;
        private final int nbTropBas;

        public Resultat(int nbExact, int nbTropHaut, int nbTropBas) {
            this.nbExact = nbExact;
            this.nbTropHaut = nbTropHaut;
            this.nbTropBas = nbTropBas;
        }

        public int getNbExact() {
            return nbExact;
        }

        public int getNbTropHaut() {
            return nbTropHaut;
        }

        public int getNbTropBas() {
            return nbTropBas;
        }
    }
}