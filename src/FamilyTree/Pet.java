package FamilyTree;

public class Pet extends Creature{
    private Creature host;


    Pet(String name, Creature host){
        super(name);
        this.host = host;
    }

    public void getHost(){
        System.out.println(host.getName());
    }

    public String getName(){
        return name;
    }

}
