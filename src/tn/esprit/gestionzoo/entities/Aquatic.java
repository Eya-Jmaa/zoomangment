package tn.esprit.gestionzoo.entities;

public abstract sealed  class Aquatic extends Animal permits Dolphin,Penguin {
    String habitat;
    public Aquatic(String family,String name,int age,boolean isMammel,String habitat){
        super(family,name,age,isMammel);
        this.habitat=habitat;
    }

    public Aquatic(){}
    @Override
    public String toString(){
        return  super.toString() +"\n"+"Habitat :"+this.habitat;
    }

    public abstract void swim();
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Aquatic){
            return this.name.equals(((Aquatic)obj).name) &&
                    this.age== ((Aquatic)obj).age &&
                    ((Aquatic)obj).habitat.equals(this.habitat);
        }
        return false;

    }
}



