package indirection;

/**
 * For whatever reason, we can't modify the Crocodile class directly.
 * We can't make it extend Animal, but we still want to add it to a Zoo.
 */
public final class Crocodile {

    private String name;

    public Crocodile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
