package Macronutrients;

interface Fats {
    String getName();
}

class Avocado implements Fats {
    public String getName() {
        return "Avocado";
    }
}

class SourCream implements Fats {
    public String getName() {
        return "Sour Cream";
    }
}
