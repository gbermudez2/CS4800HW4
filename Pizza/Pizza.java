package Pizza;
import java.util.ArrayList;
import java.util.List;

// Define the Pizza class
class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;

    public Pizza(String chain) {
        this.chain = chain;
        toppings = new ArrayList<>();
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void eat() {
        System.out.println("You ordered a " + size + " " + chain + " pizza with these toppings:");
        for (String topping : toppings) {System.out.println("- " + topping);}
    }
}