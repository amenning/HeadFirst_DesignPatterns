import Store.ChicagoPizzaStore;
import Store.NyPizzaStore;
import Store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("clam");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("cheese");
        chicagoPizzaStore.orderPizza("clam");
    }
}
