package pl.san;

import pl.san.model.bread.Bread;
import pl.san.model.bread.Ciabatta;
import pl.san.model.bread.Multigrain;
import pl.san.model.ingredient.*;
import pl.san.sandwich.Sandwich;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SandwichBar {

    public static void main(String[] args) {

        System.out.println(makeSandwich(
                new Ciabatta(),
                new Mayonnaise(),
                new Cheese(),
                new Cheese(),
                new RoastedBeef(),
                new Lettuce(),
                new Lettuce(),
                new Tomato(),
                new Onion()));

        System.out.println(makeSandwich(
                new Multigrain(),
                new Hummus(),
                new Tomato()));

    }

    private static Sandwich makeSandwich(Bread bread, Ingredient... ingredients){

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
