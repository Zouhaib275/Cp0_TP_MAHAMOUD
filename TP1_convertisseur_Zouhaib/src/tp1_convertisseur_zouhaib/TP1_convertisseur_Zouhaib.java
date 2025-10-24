/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_zouhaib;
import java.util.Scanner;
/**24/10/2025
 *
 * @author zouhaib mahamoud
 */
public class TP1_convertisseur_Zouhaib {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demande de la valeur de temperature
        System.out.print("Bonjour, saisissez une valeur : ");
        double valeur = sc.nextDouble();

        // Menu des conversions
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");

        System.out.print("Votre choix : ");
        int choix = sc.nextInt();

        double resultat = 0.0;

        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(valeur);
                System.out.println(valeur + " degre Celcius est egal a " + resultat + " degre Kelvin");
                break;
            case 2:
                resultat = KelvinVersCelcius(valeur);
                System.out.println(valeur + " degre Kelvin est egal a " + resultat + " degre Celcius");
                break;
            case 3:
                resultat = FarenheitVersCelcius(valeur);
                System.out.println(valeur + " degre Farenheit est egal a " + resultat + " degre Celcius");
                break;
            case 4:
                resultat = CelciusVersFarenheit(valeur);
                System.out.println(valeur + " degre Celcius est egal a " + resultat + " degre Farenheit");
                break;
            case 5:
                resultat = KelvinVersFarenheit(valeur);
                System.out.println(valeur + " degre Kelvin est egal a " + resultat + " degre Farenheit");
                break;
            case 6:
                resultat = FarenheitVersKelvin(valeur);
                System.out.println(valeur + " degre Farenheit est egal a " + resultat + " degre Kelvin");
                break;
            default:
                System.out.println("Choix invalide !");
                break;
        }

        sc.close();
    }

    // Conversion de Celcius vers Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        return tCelcius + 273.15;
    }

    // Conversion de Kelvin vers Celcius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }

    // Conversion de Farenheit vers Celcius
    public static double FarenheitVersCelcius(double tFarenheit) {
        return (tFarenheit - 32) * 5 / 9;
    }

    // Conversion de Celcius vers Farenheit
    public static double CelciusVersFarenheit(double tCelcius) {
        return (tCelcius * 9 / 5) + 32;
    }

    // Conversion de Kelvin vers Farenheit (en appelant d'autres methodes)
    public static double KelvinVersFarenheit(double tKelvin) {
        return CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    }

    // Conversion de Farenheit vers Kelvin (en appelant d'autres methodes)
    public static double FarenheitVersKelvin(double tFarenheit) {
        return CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
    }
}

