package FamilyTree;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();


        family.addMember(new Member("Сергей Петрович"));
        family.addMember(new Member("Людмила Ивановна"));
        family.addMember(new Member("Наталья Сергеевна"));
        family.memberAddChildren("Сергей Петрович", family.getMember("Наталья Сергеевна"));
        family.memberAddChildren("Людмила Ивановна", family.getMember("Наталья Сергеевна"));
        family.memberSetFather("Наталья Сергеевна", family.getMember("Сергей Петрович"));
        family.memberSetMother("Наталья Сергеевна", family.getMember("Людмила Ивановна"));
        family.addMember(new Member("Юлия Сергеевна"));
        family.memberAddChildren("Сергей Петрович", family.getMember("Юлия Сергеевна"));
        family.memberAddChildren("Людмила Ивановна", family.getMember("Юлия Сергеевна"));
        family.memberSetSister("Юлия Сергеевна", family.getMember("Наталья Сергеевна"));
        family.memberSetFather("Юлия Сергеевна", family.getMember("Сергей Петрович"));
        family.memberSetMother("Юлия Сергеевна", family.getMember("Людмила Ивановна"));
        family.addMember(new Member("Андрей"));


        Member tda = new Member("Дмитрий Андреевич",family.getMember("Наталья Сергеевна"), family.getMember("Андрей"));
        family.memberAddChildren("Наталья Сергеевна", tda);
        family.addMember(tda);

        Member tsd = new Member("София Дмитриевна");
        tda.addChildren(tsd);
        family.addMember(tsd);


        Member ted = new Member("Есения Дмитриевна");
        tda.addChildren(ted);
        family.addMember(tsd);




        family.getTree(family.getMember("Сергей Петрович"),0);
        tda.viewAll();
        tsd.viewAll();
    }
}
