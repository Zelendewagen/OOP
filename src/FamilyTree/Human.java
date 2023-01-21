package FamilyTree;

import java.util.*;

public class Human extends Creature implements Voice {
    private Human mother;
    private Human father;
    private List<Human> childrens = new ArrayList<>();


    Human(String name, Human mother, Human father) {
        super(name);
        this.mother = mother;
        this.father = father;
        mother.addChildren(this);
        father.addChildren(this);
    }


    Human(String name) {
        super(name);
    }


    public void viewAllInfo() {
        String fname = fatherName();
        String mname = motherName();
        System.out.printf("Имя: %s, Мама: %s, Папа: %s, Дети: %s", super.getName(), mname, fname, getNameChildrens());
        System.out.println();
    }

    @Override
    public void voice(Creature target) {
        System.out.printf("Hi %s! My name %s", target.getName(), getName());
        System.out.println();
    }

    public String fatherName() {
        if (this.father == null) {
            return "-";
        } else return father.getName();
    }

    public String motherName() {
        if (this.mother == null) {
            return "-";
        } else return mother.getName();
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    protected void addChildren(Human children) {
        this.childrens.add(children);
    }

    public List<Human> getChildrensList() {
        return childrens;
    }

    public String getNameChildrens() {
        StringBuilder childrensNames = new StringBuilder("");
        for (Human i : childrens) {
            childrensNames.append(i.getName() + ", ");
        }
        String result = childrensNames.toString();
        if (getChildrensList().size() > 0) {
            return result.substring(0, result.length() - 2);
        } else return result;
    }


}
