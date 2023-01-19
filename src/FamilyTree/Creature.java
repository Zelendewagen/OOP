package FamilyTree;

public abstract class Creature {
    protected String name;

    Creature(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

}
