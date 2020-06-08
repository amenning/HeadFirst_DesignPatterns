public class ChocolateBoiler {
    private boolean isEmpty;
    private boolean isBoiled;

    private volatile static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler () {
        isEmpty = true;
        isBoiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            // Make thread safe
            synchronized (ChocolateBoiler.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty) {
            isEmpty = false;
            isBoiled = false;
        }
    }

    public void drain() {
        if (!isEmpty && isBoiled) {
            isEmpty = true;
        }
    }

    public void boil() {
        if (!isEmpty && !isBoiled) {
            isBoiled = true;
        }
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public boolean isBoiled() {
        return isBoiled;
    }

    public String getBoilerState() {
        return "Boiler is "
            + (isEmpty ? "emtpy" : "not empty")
            + " and "
            + (isBoiled ? "boiled" : "not boiled");
    }
}
