package Ingredient;

public class ThickCrustDough extends AbstractDough {
    public ThickCrustDough() {
        name = "Thick Crust";
    }

    public Dough createDough() {
        return new ThickCrustDough();
    }
}
