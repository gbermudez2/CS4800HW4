package Macronutrients;

import java.util.List;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        List<String> customerNames = List.of("Alice", "Bob", "Joe", "Dave", "John", "Frank");
        List<String> dietPlans = List.of("No Restriction", "Paleo", "Vegan", "Nut Allergy", "No Restriction", "Paleo");
        Random random = new Random();

        for (String customerName : customerNames) {
            String dietPlan = dietPlans.get(random.nextInt(dietPlans.size()));
            MacronutrientMealFactory mealFactory = MacronutrientMealFactory.getInstance();
            Meal meal = mealFactory.createMeal(dietPlan);
            System.out.println(customerName + "'s meal:");
            meal.printMeal();
            System.out.println();
        }
    }
}
