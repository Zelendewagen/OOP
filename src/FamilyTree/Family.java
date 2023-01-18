package FamilyTree;

import java.util.*;

public class Family {
    private List<Member> lst = new ArrayList<>();

    public void addMember(Member member) {
        lst.add(member);
    }

    public Member getMember(String name) {
        for (Member i : lst) {
            if (i.getName().equals(name)) {
                return i;
            }
        }
        System.out.println("Kek");
        return null;
    }

    public void getListMembers() {
        for (Member i : this.lst) {
            i.viewAll();
        }
    }
    public void getTree(Member member, int count) {
        String branch = "|".repeat(count);
        String space = " ".repeat(count);

        System.out.print(space + branch);
        System.out.println(member.name);
        for (Member i : member.childrens) {
            getTree(i, count + 1);
        }

    }

    public void memberSetFather(String name, Member father) {
        for (Member i : lst) {
            if (i.getName().equals(name)) {
                i.setFather(father);
            }
        }
    }

    public void memberSetMother(String name, Member mother) {
        for (Member i : lst) {
            if (i.getName().equals(name)) {
                i.setMother(mother);
            }
        }
    }

    public void memberSetBrother(String name, Member brother) {
        for (Member i : lst) {
            if (i.getName().equals(name)) {
                i.setBrother(brother);
            }
        }
    }

    public void memberSetSister(String name, Member sister) {
        for (Member i : lst) {
            if (i.getName().equals(name)) {
                i.setSister(sister);
            }
        }
    }

    public void memberAddChildren(String name, Member children) {
        boolean check = false;
        for (Member i : lst) {
            if (i.getName().equals(name)) {
                i.addChildren(children);
                check = true;
            }
        }
        if (!check) {
            System.out.printf("Не найден родсвенник с именем %s", name);
        }
    }
}
