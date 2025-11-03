/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0.addition.zouhaib;
import java.util.Scanner;
/**
 *
 * @author zouhaib mahamoud
 */
public class Tp0AdditionZouhaib {

/*
 * Auteur : Zouhaib
 * Rôle : Calcul de la somme des n premiers entiers
 * Date : 2025
*/

    public static void main(String[] args) {

        int nb;     // nombre d'entiers à additionner
        int result; // résultat
        int ind;    // indice

        Scanner sc = new Scanner(System.in);

        System.out.println("Entrer le nombre :");
        nb = sc.nextInt();

        result = 0;
        ind = 1;

        while (ind <= nb) {
            result = result + ind;
            ind++;
        }

        System.out.println("La somme des " + nb + " entiers est : " + result);
    }
}
