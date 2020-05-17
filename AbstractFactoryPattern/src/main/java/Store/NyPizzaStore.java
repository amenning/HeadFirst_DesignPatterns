package Store;

import Ingredient.NyPizzaIngredientFactory;
import Ingredient.PizzaIngredientFactory;
import Pizza.CheesePizza;
import Pizza.ClamPizza;
import Pizza.Pizza;

public class NyPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();

        System.out.println("NY Pizza Store");
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        }

        return pizza;
    }
}
