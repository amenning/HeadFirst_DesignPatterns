public class Main {
    private static ChocolateBoiler boiler1;
    private static ChocolateBoiler boiler2;

    public static void main(String[] args) {
        boiler1 = ChocolateBoiler.getInstance();
        boiler2 = ChocolateBoiler.getInstance();

        System.out.println("Initial comparison of singleton");
        printBoilerDetails();

        System.out.println("Call fill on boiler1 instance");
        boiler1.fill();
        printBoilerDetails();

        System.out.println("Call boil on boiler2 instance");
        boiler2.boil();
        printBoilerDetails();

        System.out.println("Call drain  on boiler1 instance");
        boiler1.drain();
        printBoilerDetails();
    }

    public static void printBoilerDetails()
    {
        System.out.printf(
            "Boiler1 instance is %s\n",
            boiler1.getBoilerState()
        );
        System.out.printf(
            "Boiler2 instance is %s\n\n",
            boiler2.getBoilerState()
        );
    }
}
