package FamilyTree;

import java.util.*;

public class Family {
    private List<Human> familyList = new ArrayList<>();

    Family() {
    }

    public void addMember(Human member) {
        familyList.add(member);
    }

    public void getTree(Human member, int count) {
        String space = "  ".repeat(count);
        String branch = "└─";

        if (count < 1) {
            System.out.println(member.getName());
        } else {
            System.out.print(space + branch);
            System.out.println(member.getName());
        }
        for (Human i : member.getChildrensList()) {
            getTree(i, count + 1);
        }

    }

    public Human getMember(String name) {
        for (Human i : familyList) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        System.out.printf("Kek человека с именем '%s' нету", name);
        System.out.println();
        return null;
    }

    public void getListMembers() {
        for (Human i : this.familyList) {
            i.viewAllInfo();
        }
    }

    public void memberSetFather(Human children, Human father) {
        children.setFather(father);
        father.addChildren(children);
    }

    public void memberSetMother(Human children, Human mother) {
        children.setMother(mother);
        mother.addChildren(children);
    }

    public void getFamilyPets() {
        for (Creature i : familyList) {
            if (i.getPetList().size() > 0) {
                for (Pet j : i.getPetList()) {
                    System.out.println(j.getInfo());
                }
            }
        }
    }
}
