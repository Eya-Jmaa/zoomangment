package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Penguin;

import tn.esprit.gestionzoo.entities.Dolphin;
import tn.esprit.gestionzoo.entities.Terrestrial;

import tn.esprit.gestionzoo.entities.Aquatic;
import tn.esprit.gestionzoo.entities.Zoo;



public class ZooManagement {
    public static void main(String[] args) {
        Dolphin dolphin=new Dolphin();
        Penguin penguin=new Penguin();
        System.out.println("Dolphin"+dolphin);
        System.out.println("Penguin"+penguin);
        penguin.swimmingDepth=5;
        Penguin penguin1 = new Penguin();
        penguin1.swimmingDepth=10;
        Penguin penguin2 = new Penguin();
        penguin2.swimmingDepth=4;
        System.out.println("Dolphin"+dolphin);
        System.out.println("Penguin"+penguin);
        Zoo myZoo = new Zoo("myZoo", "nabeul");

        Dolphin dolphin3=new Dolphin("delphinidés", "Dolphin", 10, true, "ocean",20.5f );
        Penguin penguin3=new Penguin("Spheniscidae", "Penguin", 2, true,"ocean",10.5f);




        dolphin.swim();
        penguin.swim();;

        System.out.println(dolphin3);
        System.out.println(penguin3);
        dolphin.swim();
        penguin.swim();



    }
}





