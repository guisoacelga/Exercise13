public class Recipe {
    //FIELDS
    //specify an access modifier
    //generally private
    public int amountOfPeople; //how many people
    public String[] ingredientsNames;
    public double[][] ingredientsQuantityPrice;

    //return true if ingredient appears in the recipe
    public boolean allergic(String ingredient) {
        for (int i = 0; i < ingredientsNames.length; i++) {
            if (ingredient.equalsIgnoreCase(ingredientsNames[i])) {
                return true;
            }
        }
        return false;
    }

    //convert the recipe into lactoseFree recipe. For all ingredients with the name milk or cheese
    // set quantity and price to 0. Return true if at least one ingredient was removed.
    public boolean lactoseFree() {
        boolean isLactoseFree = false;
        for (int i = 0; i < ingredientsNames.length; i++) {
            if (ingredientsNames[i].equalsIgnoreCase("milk") || ingredientsNames[i].equalsIgnoreCase("cheese")) {
                ingredientsQuantityPrice[i][0] = 0;
                ingredientsQuantityPrice[i][1] = 0;
                isLactoseFree = true;
            }
        }
        return isLactoseFree;

    }

    //return the sum of the costs of the ingredients
    public double costs() {
        double suma = 0;
        for (int i = 0; i < ingredientsQuantityPrice.length; i++) {
            suma = suma + ingredientsQuantityPrice[i][1];
        }
        return suma;
    }

    //return the cost of ingredients per person
    public double costsPerPerson() {
        return costs()/amountOfPeople;
    }

    //scales (bigger or less) the amount and cost of ingredients to the number of people
    //number must be an integer greater than 0 or not scale anything
    public void changePersons(int number) {
        if (number >0){
            if (number == amountOfPeople){
                return;
            }
            for (int i = 0; i < ingredientsQuantityPrice.length; i++) {
                ingredientsQuantityPrice[i][0] = (ingredientsQuantityPrice[i][0]/amountOfPeople)*number;
                ingredientsQuantityPrice[i][1] = (ingredientsQuantityPrice[i][1]/amountOfPeople)*number;
            }

        }
    }


}
