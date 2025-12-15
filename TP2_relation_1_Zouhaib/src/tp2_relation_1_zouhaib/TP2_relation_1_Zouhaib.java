/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_zouhaib;

/**
 *
 * @author zouhaib mahamoud
 */
public class TP2_relation_1_Zouhaib{

    public static void main(String[] args) {

        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles :\n" +
                uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);

        // ✅ Ajouts via la méthode ajouter_voiture()
        System.out.println("\n--- Ajout voitures ---");

        System.out.println("Bob ajoute Clio : " + bob.ajouter_voiture(uneClio));
        System.out.println("Bob ajoute autre Clio : " + bob.ajouter_voiture(uneAutreClio));

        System.out.println("Reno ajoute 2008 : " + reno.ajouter_voiture(une2008));
        System.out.println("Reno ajoute Micra : " + reno.ajouter_voiture(uneMicra));

        // ✅ Vérification affichage
        System.out.println("\n--- Vérification ---");
        System.out.println("Première voiture de Bob : " + bob.liste_voitures[0]);
        System.out.println("Deuxième voiture de Bob : " + bob.liste_voitures[1]);

        System.out.println("Première voiture de Reno : " + reno.liste_voitures[0]);
        System.out.println("Deuxième voiture de Reno : " + reno.liste_voitures[1]);

        // ✅ Test voiture volée (déjà propriétaire)
        System.out.println("\n--- Test voiture déjà possédée ---");
        System.out.println("Reno essaie de prendre la Clio de Bob : " + reno.ajouter_voiture(uneClio));

        // ✅ Test limite 3 voitures
        System.out.println("\n--- Test limite 3 voitures ---");
        Voiture v1 = new Voiture("A1", "Audi", 4);
        Voiture v2 = new Voiture("A3", "Audi", 5);

        System.out.println("Bob ajoute A1 : " + bob.ajouter_voiture(v1));
        System.out.println("Bob ajoute A3 (devrait être false car déjà 3) : " + bob.ajouter_voiture(v2));
    }
}

