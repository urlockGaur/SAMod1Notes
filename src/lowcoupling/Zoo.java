package lowcoupling;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    /*
    Finish the Zoo class. You should be able to create a Zoo
    object that contains a Lion and a Monkey.
     */
    
    private List<Animal> animals = new ArrayList();
    

    
    public Zoo() {

    }
    
    public void addLion(String name) {
        Lion lion = new Lion(name);
        animals.add(lion);
    }
    
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
