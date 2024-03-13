package Macronutrients;
import java.util.Random;

class FatsFactory {
    private Random random = new Random();

    public Fats createFats(String dietPlan) {
        switch (dietPlan) {
            case "No Restriction":
                return getRandomFats();
            case "Paleo":
                return getPaleoFats();
            case "Vegan":
                return getVeganFats();
            case "Nut Allergy":
                return getNutAllergyFats();
            default:
                return null;
        }
    }

    private Fats getRandomFats() {
        Fats[] options = {new Avocado(), new SourCream()};
        return options[random.nextInt(options.length)];
    }

    private Fats getPaleoFats() {
        return new Avocado();
    }

    private Fats getVeganFats() {
        return new Avocado(); // Or any other vegan-friendly fats option
    }

    private Fats getNutAllergyFats() {
        return new Avocado(); // Or any other non-nut fats option
    }
}