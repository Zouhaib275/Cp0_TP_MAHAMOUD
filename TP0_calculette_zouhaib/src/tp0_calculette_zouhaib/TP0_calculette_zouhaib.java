/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette_zouhaib;
import java.util.Scanner;
/**
 *
 * @author zouhaib mahamoud
 */
public class TP0_calculette_zouhaib {

/*
 * Auteur : Zouhaib
 * Rôle : Calculette simple avec choix d'opérateur
 * Date : 2025
*/



public class TP0_calculette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) subtract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        int operateur = sc.nextInt();

        // Test de validité de l'opérateur
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur invalide.");
            return;
        }

        System.out.println("Please enter the first number:");
        int operande1 = sc.nextInt();

        System.out.println("Please enter the second number:");
        int operande2 = sc.nextInt();

        int result = 0;

        switch (operateur) {
            case 1:
                result = operande1 + operande2;
                break;
            case 2:
                result = operande1 - operande2;
                break;
            case 3:
                result = operande1 * operande2;
                break;
            case 4:
                if (operande2 == 0) {
                    System.out.println("Erreur : division par zéro impossible.");
                    return;
                }
                result = operande1 / operande2;
                break;
            case 5:
                if (operande2 == 0) {
                    System.out.println("Erreur : modulo par zéro impossible.");
                    return;
                }
                result = operande1 % operande2;
                break;
        }

        System.out.println("The result is : " + result);
    }
}

