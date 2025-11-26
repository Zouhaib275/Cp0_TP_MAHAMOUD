/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette_zouhaib;
import java.util.Scanner;

public class TP0_calculette_zouhaib {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- 1. Affichage du menu ----
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        // ---- 2. Lecture du choix ----
        System.out.println("Your choice :");
        int operateur = sc.nextInt();

        // ---- 3. Vérification opérateur ----
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur invalide. Veuillez choisir entre 1 et 5.");
            return;   // Stoppe le programme
        }

        // ---- 4. Saisie des deux opérandes ----
        System.out.println("Please enter the first number:");
        int operande1 = sc.nextInt();

        System.out.println("Please enter the second number:");
        int operande2 = sc.nextInt();

        int result = 0; // Variable de résultat

        // ---- 5. Calcul selon l'opération ----
        switch (operateur) {

            case 1: // addition
                result = operande1 + operande2;
                break;

            case 2: // soustraction
                result = operande1 - operande2;
                break;

            case 3: // multiplication
                result = operande1 * operande2;
                break;

            case 4: // division
                if (operande2 == 0) {
                    System.out.println("Erreur : division par zéro impossible !");
                    return;
                }
                result = operande1 / operande2;
                break;

            case 5: // modulo
                if (operande2 == 0) {
                    System.out.println("Erreur : modulo par zéro impossible !");
                    return;
                }
                result = operande1 % operande2;
                break;
        }

        // ---- 6. Affichage du résultat ----
        System.out.println("The result is : " + result);
    }
}