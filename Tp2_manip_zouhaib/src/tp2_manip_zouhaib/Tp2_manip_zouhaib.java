/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_zouhaib;

/**
 *
 * @author zouhaib mahamoud
 */
public class Tp2_manip_zouhaib {

    public static void main(String[] args) {

        // 4) Créer deux tartiflettes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        // assiette3 pointe vers le MÊME objet que assiette2
        Tartiflette assiette3 = assiette2;

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // On modifie assiette2
        assiette2.nbCalories += 100;

        System.out.println("Après modification de assiette2 :");
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // 5) Inverser assiette1 et assiette2 (swap des références)
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("Après échange assiette1 <-> assiette2 :");
        System.out.println("assiette1 calories : " + assiette1.nbCalories);
        System.out.println("assiette2 calories : " + assiette2.nbCalories);

        // 6) Lignes correctes ou non ? (on les met en commentaire car ça ne compile pas)
        // Moussaka assiette666 = assiette1;        // ❌ faux : Tartiflette n’est pas une Moussaka
        // Moussaka assiette667 = new Tartiflette(); // ❌ faux : constructeur + mauvais type

        // 7) Tableau de 10 références de Moussaka + création des 10 objets
        Moussaka[] tab = new Moussaka[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = new Moussaka(400 + i * 10); // exemple de calories
        }

        System.out.println("Tableau de Moussaka créé : " + tab.length + " objets.");
        System.out.println("Exemple tab[0] calories = " + tab[0].nbCalories);
        System.out.println("Exemple tab[9] calories = " + tab[9].nbCalories);
    }
}

