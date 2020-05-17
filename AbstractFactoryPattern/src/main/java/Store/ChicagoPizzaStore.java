package Store;

import Ingredient.ChicagoPizzaIngredientFactory;
import Ingredient.PizzaIngredientFactory;
import Pizza.CheesePizza;
import Pizza.ClamPizza;
import Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        System.out.println("Chicago Pizza Store");
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        }

        return pizza;
    }
}
