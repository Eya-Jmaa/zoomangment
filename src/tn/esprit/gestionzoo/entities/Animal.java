package tn.esprit.gestionzoo.entities;
public    class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;    public Animal(){}
    public Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }


    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family + "', age=" + age + ", isMammal=" + isMammal + "}";
    }

}


