package Pizza;
public class Driver {
    public static void main(String[] args) {
        // Create three Pizza Hut pizzas
        Pizza pizza1 = new PizzaBuilder("Pizza Hut")
                            .setSize("Large")
                            .addTopping("Pepperoni")
                            .addTopping("Mushrooms")
                            .addTopping("Extra Cheese")
                            .build();

        Pizza pizza2 = new PizzaBuilder("Pizza Hut")
                            .setSize("Small")
                            .addTopping("Onions")
                            .addTopping("Peppers")
                            .build();

        Pizza pizza3 = new PizzaBuilder("Little Caesars")
                            .setSize("Medium")
                            .addTopping("Pepperoni")
                            .addTopping("Mushrooms")
                            .addTopping("Green Pepper")
                            .addTopping("Red Pepper")
                            .addTopping("Olives")
                            .addTopping("Chicken")
                            .addTopping("Onions")
                            .addTopping("Pineapple")
                            .build();

        Pizza pizza4 = new PizzaBuilder("Little Caesars")
                            .setSize("Small")
                            .addTopping("Pepperoni")
                            .addTopping("Mushrooms")
                            .addTopping("Green Pepper")
                            .addTopping("Red Pepper")
                            .addTopping("Olives")
                            .addTopping("Chicken")
                            .build();

        Pizza pizza5 = new PizzaBuilder("Dominos")
                            .setSize("Small")
                            .addTopping("Sausage")
                            .build();

        Pizza pizza6 = new PizzaBuilder("Dominos")
                            .setSize("Large")
                            .addTopping("Spinach")
                            .addTopping("Basil")
                            .addTopping("Pineapple")
                            .build();


        pizza1.eat();
        pizza2.eat();
        pizza3.eat();
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
    }
}