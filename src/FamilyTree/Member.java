package FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Member {
    protected String name;
    protected Member mother;
    protected Member father;
    protected Member sister;
    protected Member brother;
    protected List<Member> childrens = new ArrayList<>();


    public Member(String name, Member mother, Member father) {
        this.name = name;
        this.mother = mother;
        this.father = father;
    }

    public Member(String name) {
        this.name = name;
    }

    public void viewAll() {
        List<String> result = new ArrayList<>();
        result.add("Имя: " + name);

        if (mother == null) {
            result.add("Мать: -");
        } else {
            result.add("Мать: " + mother.getName());
        }
        if (father == null) {
            result.add("Отец: -");
        } else {
            result.add("Отец: " + father.getName());
        }
        if (sister == null) {
            result.add("Сестра: -");
        } else {
            result.add("Сестра: " + sister.getName());
        }
        if (brother == null) {
            result.add("Брат: -");
        } else {
            result.add("Брат: " + brother.getName());
        }
        if (childrens.size() < 1) {
            result.add("Дети: -");
        } else {
            String childrenStr = "";
            for (Member i : childrens) {
                childrenStr += i.getName();
                if (childrens.size() > 1) {
                    childrenStr += ", ";
                }
            }
            if(childrens.size()>1) {
                result.add("Дети: " + childrenStr.substring(0, childrenStr.length() - 2));
            }
            else {
                result.add("Дети: " + childrenStr);
            }
        }

        System.out.println(result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member getFather() {
        return father;
    }

    public void setFather(Member father) {
        this.father = father;
    }

    public Member getMother() {
        return mother;
    }

    public void setMother(Member mother) {
        this.mother = mother;
    }

    public Member getSister() {
        return sister;
    }

    public void setSister(Member sister) {
        this.sister = sister;
    }

    public Member getBrother() {
        return brother;
    }

    public void setBrother(Member brother) {
        this.brother = brother;
    }

    public void addChildren(Member children) {
        this.childrens.add(children);
    }
}
