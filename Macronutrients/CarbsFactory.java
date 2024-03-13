package Macronutrients;
import java.util.Random;

class CarbsFactory {
    private Random random = new Random();

    public Carbs createCarbs(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
                return getRandomCarb();
            case "Paleo":
                return getPaleoCarb();
            case "Vegan":
                return getVeganCarb();
            case "Nut Allergy":
                return getNutAllergyCarb();
            default:
                return null;
        }
    }

    private Carbs getRandomCarb() {
        Carbs[] options = {new Bread(), new Lentils(), new Cheese()};
        return options[random.nextInt(options.length)];
    }

    private Carbs getPaleoCarb() {
        return new Pistachio();
    }

    private Carbs getVeganCarb() {
        return new Bread(); // Or any other vegan-friendly carb option
    }

    private Carbs getNutAllergyCarb() {
        return new Bread(); // Or any other non-nut carb option
    }
}