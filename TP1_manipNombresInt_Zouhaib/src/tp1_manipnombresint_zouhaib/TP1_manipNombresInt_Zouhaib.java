/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_zouhaib;

import java.util.Scanner;

/**24/10/2025
 *
 * @author zouhaib mahamoud
 */
public class TP1_manipNombresInt_Zouhaib {

   


    public static void main(String[] args) {
        // Création d'un objet Scanner pour lire les entrées clavier
        Scanner sc = new Scanner(System.in);

        // Demande à l'utilisateur de saisir deux entiers
        System.out.print("Entrez le premier entier : ");
        int a = sc.nextInt();

        System.out.print("Entrez le deuxieme entier : ");
        int b = sc.nextInt();

        // Affichage des deux entiers saisis
        System.out.println("Vous avez saisi : " + a + " et " + b);

        // Calculs et affichages
        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        System.out.println("Somme des deux nombres : " + somme);
        System.out.println("Difference des deux nombres : " + difference);
        System.out.println("Produit des deux nombres : " + produit);

        // Gestion de la division (vérification pour éviter la division par zéro)
        if (b != 0) {
            int quotient = a / b;
            int reste = a % b;

            System.out.println("Quotient entier de la division de " + a + " par " + b + " : " + quotient);
            System.out.println("Reste de la division euclidienne : " + reste);
        } else {
            System.out.println("Division impossible : le deuxième nombre est zéro !");
        }

        // Fermeture du scanner
        sc.close();
    }
}
