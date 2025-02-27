package tn.esprit.gestionzoo.entities;
public class Zoo {}
    /*Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    public void displayZoo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', nbrCages=" + nbrCages + "}";
    }*/


    /*private static final int MAX_ANIMALS = 25;
    private static final int nbrCages = 25;
    private Animal[] animals;
    private String name;

    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_ANIMALS];
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) { // Vérifie si le zoo est déjà plein
            System.out.println("Le zoo est plein ! Impossible d'ajouter " + animal.name);
            return false;
        }

        animals[animalCount++] = animal;
        return true;
    }
    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Le zoo ne contient aucun animal.");
            return;
        }

        System.out.println("Liste des animaux dans le zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("- " + animals[i]);
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal non trouvé !");
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[--animalCount] = null;
        return true;
    }
    public boolean isZooFull() {
        return animalCount >= MAX_ANIMALS;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }
    public String getName() {
        return name;
    }

        private static final int MAX_ANIMALS = 25;
        private Animal[] animals;
        private String name;
        private String city;
        private int animalCount = 0;

        public Zoo(String name, String city) {
            setName(name);
            this.city = city;
            this.animals = new Animal[MAX_ANIMALS];
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.trim().isEmpty()) {
                System.out.println("Erreur : Le nom du zoo ne peut pas être vide !");
                this.name = "Zoo par défaut";
            } else {
                this.name = name;
            }
        }

        public boolean isZooFull() {
            return animalCount >= MAX_ANIMALS;
        }

        public boolean addAnimal(Animal animal) {
            if (isZooFull()) {
                System.out.println("Le zoo est plein ! Impossible d'ajouter " + animal.getName());
                return false;
            }
            animals[animalCount++] = animal;
            return true;
        }

        @Override
        public String toString() {
            return "Zoo{name='" + name + "', city='" + city + "', animalCount=" + animalCount + "}";
        }
    }*/
