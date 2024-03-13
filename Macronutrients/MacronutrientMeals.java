package Macronutrients;

class MacronutrientMealFactory implements MacronutrientInterface {
    private static MacronutrientMealFactory instance;
    private CarbsFactory carbsFactory;
    private ProteinFactory proteinFactory;
    private FatsFactory fatsFactory;

    private MacronutrientMealFactory() {
        carbsFactory = new CarbsFactory();
        proteinFactory = new ProteinFactory();
        fatsFactory = new FatsFactory();
    }

    public static MacronutrientMealFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientMealFactory();
        }
        return instance;
    }

    public Meal createMeal(String dietPlan) {
        Carbs carbs = carbsFactory.createCarbs(dietPlan);
        Protein protein = proteinFactory.createProtein(dietPlan);
        Fats fats = fatsFactory.createFats(dietPlan);

        return new Meal(carbs, protein, fats);
    }

    @Override
    public Carbs createCarbs() {
        return null; // Not used
    }

    @Override
    public Protein createProtein() {
        return null; // Not used
    }

    @Override
    public Fats createFats() {
        return null; // Not used
    }
}

