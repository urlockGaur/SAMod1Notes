package lowcoupling;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    /*
    Modify the Zoo class. A Zoo should be able to
    contain a Lion and a Monkey in a single list.
     */


    private List<Animal> animals = new ArrayList<>();


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }


    }
}
