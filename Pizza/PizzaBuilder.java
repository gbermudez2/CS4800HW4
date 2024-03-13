package Pizza;
class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder(String chain) {
        pizza = new Pizza(chain);
    }

    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        pizza.addTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}