package lowcoupling;

public class ZooDriver {

    public static void main(String[] args) {
        /*
        Create a Zoo object that contains a Monkey and a Lion.
         */

        Zoo zoo = new Zoo();

        Lion lion = new Lion("Bob");
        zoo.addAnimal(lion);
        zoo.addAnimal(new Monkey("Bill"));
        zoo.listAnimals();


    }
}
