/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP1_guessMyNumber_zouhaib;

import java.util.Random;
import java.util.Scanner;

public class tp1_guessmynumber_zouhaib1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int nombreMystere = rand.nextInt(100) + 1;  // nombre entre 1 et 100
        int guess = 0;

        System.out.println("Bienvenue dans Guess My Number !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. Devine lequel !");

        while (guess != nombreMystere) {
            System.out.print("Entre un nombre : ");

            // vérifie que l'entrée est bien un entier
            while (!sc.hasNextInt()) {
                System.out.print("Veuillez entrer un nombre valide : ");
                sc.next();
            }

            guess = sc.nextInt();

            if (guess < nombreMystere) {
                System.out.println("Trop petit !");
            } else if (guess > nombreMystere) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Bravo ! Tu as trouvé le nombre ");
            }
        }

        sc.close();
    }
}
