/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_zouhaib;

/**
 *
 * @author zouhaib mahamoud
 */
public class Personne {

    String prenom;
    String nom;

    int nbVoitures;
    Voiture[] liste_voitures; // max 3 voitures

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;

        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // reserve 3 places
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

    // ✅ Méthode demandée (question 10)
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

        // Si la voiture a déjà un propriétaire -> impossible
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }

        // Si la personne a déjà 3 voitures -> impossible
        if (nbVoitures >= 3) {
            return false;
        }

        // Sinon on ajoute dans la case libre (indice = nbVoitures)
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;

        // La voiture doit connaitre son propriétaire : l'objet courant = this
        voiture_a_ajouter.proprietaire = this;

        return true;
    }
}
