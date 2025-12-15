/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_zouhaib1;
import Armes.*;
import java.util.ArrayList;
/**
 *
 * @author zouhaib mahamoud
 */
public class TP3_Heroic_Fantasy_Zouhaib1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}


public class TP3_Heroic_Fantasy_Zouhaib1 {
    public static void main(String[] args) {

        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        ArrayList<Arme> inventaireArmes = new ArrayList<>();
        inventaireArmes.add(excalibur);
        inventaireArmes.add(durandal);
        inventaireArmes.add(chene);
        inventaireArmes.add(charme);

        System.out.println("=== Armes ===");
        for (int i = 0; i < inventaireArmes.size(); i++) {
            System.out.println(inventaireArmes.get(i));
        }
    }
}