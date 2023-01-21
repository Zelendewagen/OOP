package FamilyTree;

public class Cat extends Pet implements Voice {

    Cat(String name, String breed, Creature host) {
        super(name, breed, host);
    }

    @Override
    public void voice(Creature target) {
        System.out.printf("MEOW! %s! Im %s %s! My name: %s, my host: %s",
                target.getName(), getBreed(),getClass().getSimpleName(), getName(), getHost());
        System.out.println();
    }


}
