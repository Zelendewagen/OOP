package FamilyTree;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();


        family.addMember(new Human("Сергей Петрович"));
        family.addMember(new Human("Людмила Ивановна"));
        family.addMember(new Human("Наталья Сергеевна"));
        family.memberAddChildren(family.getMember("Сергей Петрович"), family.getMember("Наталья Сергеевна"));
        family.memberAddChildren(family.getMember("Людмила Ивановна"), family.getMember("Наталья Сергеевна"));
        family.memberSetFather(family.getMember("Наталья Сергеевна"), family.getMember("Сергей Петрович"));
        family.memberSetMother(family.getMember("Наталья Сергеевна"), family.getMember("Людмила Ивановна"));
        family.addMember(new Human("Юлия Сергеевна"));
        family.memberAddChildren(family.getMember("Сергей Петрович"), family.getMember("Юлия Сергеевна"));
        family.memberAddChildren(family.getMember("Людмила Ивановна"), family.getMember("Юлия Сергеевна"));
        family.memberSetFather(family.getMember("Юлия Сергеевна"), family.getMember("Сергей Петрович"));
        family.memberSetMother(family.getMember("Юлия Сергеевна"), family.getMember("Людмила Ивановна"));
        family.addMember(new Human("Андрей"));



        Human tda = new Human("Дмитрий Андреевич",family.getMember("Наталья Сергеевна"), family.getMember("Андрей"));
        family.memberAddChildren(family.getMember("Наталья Сергеевна"), tda);
        family.addMember(tda);

        Human tsd = new Human("София Дмитриевна");
        tda.addChildren(tsd);
        family.addMember(tsd);


        Human ted = new Human("Есения Дмитриевна");
        tda.addChildren(ted);
        family.addMember(tsd);




        family.getTree(family.getMember("Сергей Петрович"),0);
        tda.viewAllInfo();
        tsd.viewAllInfo();
        family.getMember("Сергей Петрович").viewAllInfo();

        Pet mark = new Pet("Mark", tda);
        tda.setPet(mark);
        tda.getPet();
        mark.getHost();


    }
}
