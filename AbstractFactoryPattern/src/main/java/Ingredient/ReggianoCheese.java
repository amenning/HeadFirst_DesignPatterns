package Ingredient;

public class ReggianoCheese extends AbstractCheese {
    public ReggianoCheese() {
        name = "Reggiano";
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
