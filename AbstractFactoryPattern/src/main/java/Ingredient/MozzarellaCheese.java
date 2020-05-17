package Ingredient;

public class MozzarellaCheese extends AbstractCheese {
    public MozzarellaCheese() {
        name = "Mozzarella";
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
