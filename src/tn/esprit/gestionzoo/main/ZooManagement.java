package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Penguin;

import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Terrestrial;

import tn.esprit.gestionzoo.entities.Aquatic;


public class ZooManagement {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin("Delphinidae", "Dauphin", 10, true, "Ocean", 30.5f);
        Penguin penguin = new Penguin("Spheniscidae", "Pinguin", 5, false, "Arctic", 15.2f);

        System.out.println(dolphin);
        System.out.println(penguin);
    }
}





