package lowcoupling;

public class Lion extends Animal{

    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
