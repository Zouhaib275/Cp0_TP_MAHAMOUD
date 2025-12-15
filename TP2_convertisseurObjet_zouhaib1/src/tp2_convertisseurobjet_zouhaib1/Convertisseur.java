/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_zouhaib1;

/**
 *
 * @author zouhaib mahamoud
 */
public class Convertisseur {
    

    int nbConversions;

    // Constructeur
    public Convertisseur() {
        nbConversions = 0;
    }

    // Celsius vers Fahrenheit
    public double celciusVersFarenheit(double c) {
        nbConversions++;
        return c * 1.8 + 32;
    }

    // Fahrenheit vers Celsius
    public double farenheitVersCelcius(double f) {
        nbConversions++;
        return (f - 32) / 1.8;
    }

    // Affichage du nombre de conversions
    @Override
    public String toString() {
        return "Nombre de conversions = " + nbConversions;
    }
}

    

