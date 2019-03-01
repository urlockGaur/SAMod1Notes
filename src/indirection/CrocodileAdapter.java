package indirection;

import lowcoupling.Animal;

public class CrocodileAdapter extends Animal {
    
    private Crocodile c;

    public CrocodileAdapter(Crocodile c){
        super(c.getName());
        this.c = c;
    }
}
