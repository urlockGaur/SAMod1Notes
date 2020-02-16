package indirection;

import lowcoupling.Animal;

/**
 * This example of indirection uses the Adapter design pattern.
 * The CrocodileAdapter extends Animal, so it can be added
 * to Zoos. It wraps a Crocodile object, allowing it be treated
 * like an Animal.
 */
public class CrocodileAdapter extends Animal {
    
    private Crocodile c;

    public CrocodileAdapter(Crocodile c){
        super(c.getName());
        this.c = c;
    }

}
