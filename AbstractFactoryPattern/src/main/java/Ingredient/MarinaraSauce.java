package Ingredient;

public class MarinaraSauce extends AbstractSauce {
    public MarinaraSauce() {
        name = "Marinara";
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }
}
