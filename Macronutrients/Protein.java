package Macronutrients;

interface Protein {
    String getName();
}

class Fish implements Protein {
    public String getName() {
        return "Fish";
    }
}

class Beef implements Protein {
    public String getName() {
        return "Beef";
    }
}

class Tofu implements Protein {
    public String getName() {
        return "Tofu";
    }
}

class Chicken implements Protein {
    public String getName() {
        return "Chicken";
    }
}