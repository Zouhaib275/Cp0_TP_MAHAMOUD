/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_zouhaib;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_ZOUHAIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        // Choix du mode de difficulte
        System.out.println("Choisissez le niveau de difficulte :");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        System.out.println("4) Cauchemar");
        System.out.print("Votre choix : ");

        int choix;
        if (sc.hasNextInt()) {
            choix = sc.nextInt();
        } else {
            System.out.println("Choix invalide, mode normal active");
            sc.nextLine();
            choix = 2;
        }

        int max = 100;
        int nbCoupsMax = Integer.MAX_VALUE;
        boolean modeCauchemar = false;

        switch (choix) {
            case 1:
                max = 50;
                System.out.println("Mode facile choisi : nombre entre 0 et 50");
                break;
            case 2:
                max = 100;
                System.out.println("Mode normal choisi : nombre entre 0 et 100");
                break;
            case 3:
                max = 500;
                nbCoupsMax = 10;
                System.out.println("Mode difficile choisi : nombre entre 0 et 500, 10 tentatives maximum");
                break;
            case 4:
                max = 100;
                modeCauchemar = true;
                System.out.println("Mode cauchemar active !");
                break;
            default:
                System.out.println("Choix invalide, mode normal active");
                max = 100;
        }

        int nombreMystere = generateurAleat.nextInt(max + 1);
        int tentative;
        int compteur = 0;
        boolean gagne = false;

        int seuilAlerte = Math.max(1, max / 5);

        System.out.println("Devinez le nombre entre 0 et " + max + " :");

        while (!gagne && compteur < nbCoupsMax) {
            System.out.print("Votre proposition (entier entre 0 et " + max + ") : ");

            if (!sc.hasNextInt()) {
                System.out.println("Entree invalide. Veuillez entrer un entier.");
                sc.nextLine();
                continue;
            }

            tentative = sc.nextInt();

            if (tentative < 0 || tentative > max) {
                System.out.println("Valeur hors intervalle. Essayez encore.");
                continue;
            }

            compteur++;

            boolean mentir = modeCauchemar && (generateurAleat.nextInt(100) < 30);

            if (tentative == nombreMystere) {
                System.out.println("Gagne ! Vous avez trouve en " + compteur + " tentatives.");
                gagne = true;
            } else {
                boolean tropPetit = tentative < nombreMystere;
                boolean tropGrand = tentative > nombreMystere;

                if (mentir) {
                    System.out.println(tropPetit ? "Trop grand !" : "Trop petit !");
                } else {
                    int ecart = Math.abs(tentative - nombreMystere);
                    if (ecart > seuilAlerte)
                        System.out.println(tropPetit ? "Vraiment trop petit !" : "Vraiment trop grand !");
                    else
                        System.out.println(tropPetit ? "Trop petit !" : "Trop grand !");
                }
            }
        }

        if (!gagne && nbCoupsMax != Integer.MAX_VALUE) {
            System.out.println("Perdu ! Vous avez utilise toutes vos tentatives. Le nombre etait " + nombreMystere);
        }

        sc.close();
    }
}
