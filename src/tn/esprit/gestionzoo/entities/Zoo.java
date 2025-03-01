package tn.esprit.gestionzoo.entities;
public class Zoo {
    Animal[] animals;
    Aquatic[] aquaticAnimals;
    String name, city;
    public static final int nbCages = 25;
    int nbAnimal, nbrAquatics;
    static int nbrAnimalTotal;

    public Zoo() {

        animals = new Animal[nbCages];
        aquaticAnimals = new Aquatic[10];
    }

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbCages];
    }

    public void displayZoo() {
        System.out.println("Name : " + name);
        System.out.println("City : " + city);
        System.out.println("NbCages : " + nbCages);
    }

    @Override
    public String toString() {
        String s = "Name : " + name + "\n" + "City : " + city + "\n" + "NbCages : "
                + nbCages;
        String r = "";
        for (int i = 0; i < nbAnimal; i++) {
            r += animals[i];
        }
        return s + r;
    }

    public boolean addAnimal(Animal animal) {
        if (nbAnimal < nbCages) {
            animals[nbAnimal] = animal;
            nbAnimal++;
            nbrAnimalTotal++;
            return true;
        } else {
            return false;
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimal; i++) {
            if (animals[i].name == animal.name) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int x = this.searchAnimal(animal);
        if (x != -1) {
            for (int i = x; i < nbAnimal - 1; i++) {
                animals[i] = animals[i + 1];

            }
            animals[nbAnimal] = null;
            nbAnimal--;
            nbrAnimalTotal--;
            return true;
        }
        return false;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbAnimal > z2.nbAnimal) {
            return z1;
        } else {
            return z2;
        }
    }

    public Zoo comparer(Zoo z1) {
        if (z1.nbAnimal > nbAnimal) {
            return z1;
        } else {
            return this;
        }
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (nbrAquatics < 10) {
            aquaticAnimals[nbrAquatics] = aquatic;
            nbrAquatics++;
        }
    }
    public float maxPenguinSwimmingDepth(){
        float maxSwimm=0;
        for(int i=0;i<nbrAquatics;i++){
            if(aquaticAnimals[i] instanceof Penguin){
                if (((Penguin) aquaticAnimals[i]).swimmingDepth>maxSwimm){
                    maxSwimm = ((Penguin) aquaticAnimals[i]).swimmingDepth;
                }
            }

        }
        return maxSwimm;
    }
    public void displayNumberOfAquaticsByType(){
        int nbrPenguins = 0;
        int nbrDolphins = 0;
        for (int i = 0; i < nbrAquatics; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                nbrDolphins++;
            }
            if (aquaticAnimals[i] instanceof Penguin) {
                nbrPenguins++;
            }
        }
    }
}