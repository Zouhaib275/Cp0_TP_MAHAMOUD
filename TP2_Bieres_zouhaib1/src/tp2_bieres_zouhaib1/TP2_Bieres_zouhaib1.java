/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_zouhaib1;

/**
 *
 * @author zouhaib mahamoud
 */
public class TP2_Bieres_zouhaib1 {

    public static void main(String[] args) {

        BouteilleBiere b1 = new BouteilleBiere(
                "Cuvée des trolls", 7.0, "Dubuisson");

        BouteilleBiere b2 = new BouteilleBiere(
                "Leffe", 6.6, "Abbaye de Leffe");

        b1.lireEtiquette();
        b2.lireEtiquette();

        b1.decapsuler();

        System.out.println(b1);
        System.out.println(b2);
    }
}
