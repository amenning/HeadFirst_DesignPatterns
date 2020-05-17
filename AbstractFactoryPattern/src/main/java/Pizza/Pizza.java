package Pizza;

import Ingredient.Cheese;
import Ingredient.Clams;
import Ingredient.Dough;
import Ingredient.Sauce;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    public abstract void prepare();

    public void startPreparing() {
        System.out.println("Preparing " + name + " pizza");
    }

    public void prepareDough() {
        System.out.printf("    on %s dough%n", dough.getName());
    }

    public void prepareSauce() {
        System.out.printf("    with %s sauce%n", sauce.getName());
    }

    public void prepareCheese() {
        System.out.printf("    with %s cheese%n", cheese.getName());
    }

    public void prepareClams() {
        System.out.printf("    cooked with %s clams%n", clams.getName());
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box\n\n");
    }
}
