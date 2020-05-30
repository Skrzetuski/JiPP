package pl.san.sandwich;

import pl.san.model.bread.Bread;
import pl.san.model.ingredient.Ingredient;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SandwichMaker {

    private SandwichMaker(){}

    public static Sandwich makeSandwich(Bread bread, Ingredient... ingredients){

        BigDecimal price = BigDecimal.valueOf(0.0);
        var ingredientsList = new ArrayList<Ingredient>();

        price = price.add(bread.getPrice());

        for (var ingredient : ingredients){
            price = price.add(ingredient.getPrice());
            ingredientsList.add(ingredient);
        }

        return Sandwich.builder().bread(bread).ingredients(ingredientsList).price(price).build();
    }
}
