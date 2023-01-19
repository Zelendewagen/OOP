package FamilyTree;

import java.util.*;

public class Family {
    private List<Human> lst = new ArrayList<>();


    Family() {
    }

    public void addMember(Human member) {
        lst.add(member);
    }

    public Human getMember(String name) {
        for (Human i : lst) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        System.out.println("Kek");
        return null;
    }

    public void getListMembers() {
        for (Human i : this.lst) {
            i.viewAllInfo();
        }
    }

    public void getTree(Human member, int count) {
        String space = "  ".repeat(count);
        String branch = "└─";
        String line = "├─";

        if (count < 1) {
            System.out.println(member.getName());
        } else {
            System.out.print(space + branch);
            System.out.println(member.getName());
        }
        for (Human i : member.getChildrens()) {
            getTree(i, count + 1);
        }

    }

    public void memberSetFather(Human human, Human father) {
        human.setFather(father);
    }

    public void memberSetMother(Human human, Human mother) {
        human.setMother(mother);
    }

    public void memberAddChildren(Human human, Human children) {
        human.addChildren(children);
    }
}
