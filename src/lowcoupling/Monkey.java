package lowcoupling;

public class Monkey extends Animal {

    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
