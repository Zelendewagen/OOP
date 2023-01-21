package FamilyTree;

public class Dog extends Pet implements Voice {

    Dog(String name, String breed, Creature host) {
        super(name, breed, host);
    }

    @Override
    public void voice(Creature target) {
        System.out.printf("Woof WOOF! %s! Im %s %s! My name: %s, my host: %s",
                target.getName(), getBreed(), getClass().getSimpleName(), getName(), getHost());
        System.out.println();
    }


}
