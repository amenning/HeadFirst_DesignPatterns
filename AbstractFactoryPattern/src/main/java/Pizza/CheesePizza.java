package Pizza;

import Ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        name = "Cheese";

        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        startPreparing();
        dough = ingredientFactory.createDough();
        prepareDough();

        sauce = ingredientFactory.createSauce();
        prepareSauce();

        cheese = ingredientFactory.createCheese();
        prepareCheese();
    }
}
