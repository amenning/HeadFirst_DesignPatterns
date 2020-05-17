package Ingredient;

public class FreshClams extends AbstractClams {
    public FreshClams() {
        name = "Fresh";
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
