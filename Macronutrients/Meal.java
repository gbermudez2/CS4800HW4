package Macronutrients;

class Meal {
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Carbs carbs, Protein protein, Fats fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void printMeal() {
        System.out.println("Carbs: " + carbs.getName());
        System.out.println("Protein: " + protein.getName());
        System.out.println("Fats: " + fats.getName());
    }
}