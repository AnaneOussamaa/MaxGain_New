package org.example;

import Service.SalleService;
import entities.salle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        salle s1 = new salle("MG lac", "lac1", "C:\\Users\\Hadil\\Desktop\\photo pidev", "MG lac1");
        salle s2 = new salle("MG Soukra", "soukra", "photo2", "MG soukra ");
        salle s3 = new salle("MG Boumhal", "boumhal", "photo3 ", "MG boumhal");
        SalleService ss = new SalleService();

        //ss.addPreS(s1);
        //ss.addPreS(s2);
        //ss.addPreS(s3);

        //ss.delete(3);
       // salle updatedSalle = new salle();
       // updatedSalle.setNom("MG Boumhal");
       // updatedSalle.setAdresse("Boumhal");
       // updatedSalle.setImage("terrain");
        //updatedSalle.setDescription("hhhhhh");

        // Call the update method with the ID of the terrain to be modified and the updatedTerrain instance
        //ss.update(updatedSalle, 4);

        //ss.readAll().forEach(System.out::println);
        salle salle = new salle();
        salle.setNom("MG Boumhal");
        ss.recherche(salle);
    }
}
