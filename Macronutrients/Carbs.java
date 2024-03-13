package Macronutrients;

interface Carbs {
    String getName();
}

class Bread implements Carbs {
    public String getName() {
        return "Bread";
    }
}

class Lentils implements Carbs {
    public String getName() {
        return "Lentils";
    }
}

class Cheese implements Carbs {
    public String getName() {
        return "Cheese";
    }
}

class Pistachio implements Carbs {
    public String getName() {
        return "Pistachio";
    }
}