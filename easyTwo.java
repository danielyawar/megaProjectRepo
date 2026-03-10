public class easyTwo {
    private final String storeName;
    private final boolean showTax;
    private final double taxRate;

    public easyTwo(String storeName, boolean showTax, double taxRate){
        this.storeName = storeName;
        this.showTax = showTax;
        this.taxRate = taxRate;

        // keep existing welcome messages (optional)
        System.out.println("Welcome to "+ storeName + "!");
        if (showTax) {
            System.out.println("Our tax rate is " + taxRate + "!");
        }
    }

    @Override
    public String toString() {
        if (showTax) {
            return "Store: " + storeName + " (tax rate: " + taxRate + "%)";
        }
        return "Store: " + storeName;
    }
}