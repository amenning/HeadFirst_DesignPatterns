package Ingredient;

public class ThinCrustDough extends AbstractDough {
    public ThinCrustDough() {
        name = "Thin Crust";
    }

    public Dough createDough() {
        return new ThinCrustDough();
    }
}
