/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_zouhaib;

/**
 *
 * @author zouhaib mahamoud
 */
public class Voiture {

    String modele;
    String marque;
    int nbPlaces;

    Personne proprietaire; // relation : 1 voiture -> 1 personne (ou null)

    public Voiture(String modele, String marque, int nbPlaces) {
        this.modele = modele;
        this.marque = marque;
        this.nbPlaces = nbPlaces;
        this.proprietaire = null; // au début : personne
    }

    @Override
    public String toString() {
        return modele + " - " + marque + " (" + nbPlaces + " places)";
    }
}

