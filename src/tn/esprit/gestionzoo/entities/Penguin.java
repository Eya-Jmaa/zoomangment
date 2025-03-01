package tn.esprit.gestionzoo.entities;

public non-sealed class Penguin  extends Aquatic{
    public float swimmingDepth;
    public Penguin(String family,String name,int age
            ,boolean isMammel,String habitat,float swimmingDepth){
        super(family,name,age,isMammel,habitat);
        this.swimmingDepth=swimmingDepth;
    }
    public Penguin(){}

    @Override
    public void swim() {
        System.out.println("This Penguin  is swimming");
    }
}

