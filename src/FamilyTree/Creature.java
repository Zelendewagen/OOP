package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public abstract class Creature {
    private String name;
    protected List<Pet> petList = new ArrayList<>();

    Creature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    public List<Pet> getPetList() {
        return petList;
    }


}
