package Ingredient;

public class PlumTomatoSauce extends AbstractSauce {
    public PlumTomatoSauce() {
        name = "Plum Tomato";
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
