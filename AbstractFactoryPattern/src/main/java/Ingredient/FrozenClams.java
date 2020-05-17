package Ingredient;

public class FrozenClams extends AbstractClams {
    public FrozenClams() {
        name = "Frozen";
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
