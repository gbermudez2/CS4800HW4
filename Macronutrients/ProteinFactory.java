package Macronutrients;
import java.util.Random;

class ProteinFactory {
    private Random random = new Random();

    public Protein createProtein(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
                return getRandomProtein();
            case "Paleo":
                return getPaleoProtein();
            case "Vegan":
                return getVeganProtein();
            case "Nut Allergy":
                return getNutAllergyProtein();
            default:
                return null;
        }
    }

    private Protein getRandomProtein() {
        Protein[] options = {new Fish(), new Beef(), new Tofu(), new Chicken()};
        return options[random.nextInt(options.length)];
    }

    private Protein getPaleoProtein() {
        return new Fish();
    }

    private Protein getVeganProtein() {
        return new Tofu();
    }

    private Protein getNutAllergyProtein() {
        return new Chicken(); // Or any other non-nut protein option
    }
}
