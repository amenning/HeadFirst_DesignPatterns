package Pizza;

import Ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
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

        clams = ingredientFactory.createClams();
        prepareClams();
    }
}
