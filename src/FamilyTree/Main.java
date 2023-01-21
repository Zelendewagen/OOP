package FamilyTree;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();


        family.addMember(new Human("Сергей Петрович"));
        family.addMember(new Human("Наталья Сергеевна"));
        family.memberSetFather(family.getMember("Наталья Сергеевна"), family.getMember("Сергей Петрович"));

        Human july = new Human("Юлия Сергеевна");
        family.addMember(july);
        family.memberSetFather(july, family.getMember("Сергей Петрович"));

        Human andr = new Human("Андрей");

        Human tda = new Human("Дмитрий Андреевич", family.getMember("Наталья Сергеевна"), andr);
        family.addMember(tda);

        family.addMember(new Human("Мария"));

        Human tsd = new Human("София Дмитриевна", tda, family.getMember("Мария"));
        family.addMember(tsd);

        Human ted = new Human("Есения Дмитриевна", tda, family.getMember("Мария"));
        family.addMember(ted);


        family.getTree(family.getMember("Сергей Петрович"), 0);
        System.out.println();

        Cat mark = new Cat("Mark", "Bengal", family.getMember("Мария"));

        Dog oksana = new Dog("Oksana", "Haski", tsd);

        family.getListMembers();
        family.getFamilyPets();
        System.out.println();

        tsd.voice(mark);
        mark.voice(tsd);
        System.out.println();

        tda.voice(oksana);
        oksana.voice(tda);
        System.out.println();




    }
}
