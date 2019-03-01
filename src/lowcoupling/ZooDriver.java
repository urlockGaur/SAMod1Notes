package lowcoupling;

import indirection.Crocodile;
import indirection.CrocodileAdapter;

public class ZooDriver {

    public static void main(String[] args) {
        /*
        Create a Zoo object that contains a Monkey and a Lion.
         */
        
        Zoo zoo = new Zoo();
        Lion lion = new Lion("Bob");
        zoo.addAnimal(lion);
        Monkey monkey = new Monkey("Patches");
        zoo.addAnimal(monkey);
        Crocodile c = new Crocodile("See");
        CrocodileAdapter ca = new CrocodileAdapter(c);
        zoo.addAnimal(ca);
    }
}
