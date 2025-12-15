/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_zouhaib1;

/**
 *
 * @author zouhaib mahamoud
 */
public class TP2_convertisseurObjet_zouhaib1 {

    public static void main(String[] args) {

        Convertisseur c1 = new Convertisseur();

        System.out.println("20°C = " + c1.celciusVersFarenheit(20) + "°F");
        System.out.println("68°F = " + c1.farenheitVersCelcius(68) + "°C");

        System.out.println(c1);

        Convertisseur c2 = new Convertisseur();
        c2.celciusVersFarenheit(0);
        c2.celciusVersFarenheit(100);

        System.out.println(c2);
    }
}
