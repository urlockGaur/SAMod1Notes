package indirection;

/**
 * This example of indirection uses the Adapter design pattern.
 * The CrocodileAdapter extends Animal, so it can be added
 * to Zoos. It wraps a Crocodile object, allowing it be treated
 * like an Animal.
 */
public class CrocodileAdapter {
    
    private Crocodile c;

    public CrocodileAdapter(Crocodile c){
        this.c = c;
    }

}
