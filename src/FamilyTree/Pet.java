package FamilyTree;

public abstract class Pet extends Creature {
    private Creature host;
    private String breed;


    Pet(String name, String breed, Creature host) {
        super(name);
        this.breed = breed;
        this.host = host;
        setPet(host);
    }

    public void setPet(Creature host) {
        host.petList.add(this);
    }
    public String getHost() {
        return host.getName();
    }

    public String getBreed(){return breed;}

    public String  getInfo(){
        return String.format("%s %s, host: %s", this.getClass().getSimpleName(),this.getName(),this.getHost());
    }


}
