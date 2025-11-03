/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_zouhaib;

import java.util.Scanner;

/**
 *
 * @author zouhaib mahamoud
 */
public class TP1_stats_zouhaib {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nombre;
        int somme = 0;
        int compteur = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Bonjour Zouhaib, entrez des entiers (0 pour terminer) :");

        do {
            System.out.print("Nombre : ");
            nombre = sc.nextInt();

            if (nombre != 0) {
                somme += nombre;
                compteur++;

                if (nombre < min) {
                    min = nombre;
                }

                if (nombre > max) {
                    max = nombre;
                }
            }
        } while (nombre != 0);

        if (compteur > 0) {
            double moyenne = (double) somme / compteur;

            System.out.println("----- Résultats -----");
            System.out.println("Somme = " + somme);
            System.out.println("Moyenne = " + moyenne);
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        } else {
            System.out.println("Aucun nombre saisi.");
        }

        sc.close();
    }
}