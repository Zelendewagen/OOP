package FamilyTree;

import java.util.*;

public class Human extends Creature {
    protected Human mother;
    private Human father;
    private List<Human> childrens = new ArrayList<>();

    private Pet pet;


    Human(String name, Human mother, Human father) {
        super(name);
        this.mother = mother;
        this.father = father;
    }


    Human(String name) {
        super(name);
    }


    public void viewAllInfo() {
        String fname, mname = "";
        if (father == null) {
            fname = "-";
        } else {
            fname = father.getName();
        }
        if (mother == null) {
            mname = "-";
        } else {
            mname = mother.getName();
        }
        System.out.printf("Имя: %s, Мать: %s, Отец: %s, Дети: %s", super.getName(), mname, fname, getNameChildrens());
        System.out.println();
    }

    public String check() {
        System.out.println(this == null);
        return "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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


    public void addChildren(Human children) {
        this.childrens.add(children);
    }

    public List<Human> getChildrens() {
        return childrens;
    }

    public String getNameChildrens() {
        StringBuilder childrensNames = new StringBuilder("");
        for (Human i : childrens) {
            childrensNames.append(i.getName() + ", ");
        }
        String result = childrensNames.toString();
        if (getChildrens().size() > 1) {
            return result.substring(0, result.length() - 2);
        } else return result;
    }

    public void setPet(Pet name){
        this.pet = name;
    }

    public void getPet(){
        System.out.println(pet.getName());
    }
}
