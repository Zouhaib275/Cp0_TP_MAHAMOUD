/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_zouhaib1;

/**
 *
 * @author zouhaib mahamoud
 */
public class BouteilleBiere {

    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    // Constructeur
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    // Méthode pour afficher l'étiquette
    public void lireEtiquette() {
        System.out.println(
            "Bouteille de " + nom + " (" + degreAlcool + " degrés)\n" +
            "Brasserie : " + brasserie
        );
    }

    // Méthode pour ouvrir la bière
    public boolean decapsuler() {
        if (ouverte == false) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;
        }
    }

    // Affichage de l'objet
    @Override
    public String toString() {
        String txt = nom + " (" + degreAlcool + " degrés) - Ouverte ? ";
        if (ouverte) {
            txt += "oui";
        } else {
            txt += "non";
        }
        return txt;
    }
}
