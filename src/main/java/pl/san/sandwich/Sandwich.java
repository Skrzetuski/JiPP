package pl.san.sandwich;

import lombok.*;
import pl.san.model.Component;
import pl.san.model.bread.Bread;
import pl.san.model.ingredient.Ingredient;

import java.math.BigDecimal;
import java.util.List;


@Builder
public class Sandwich {

    private static final String brandName = "Bobby Sandwich";

    private Bread bread;

    private List<Ingredient> ingredients;

    private BigDecimal price;

    @Override
    public String toString() {
        var ingredientsTmp = "";
        var ingredientsStream = ingredients.stream().map(Component::getName).reduce((s, s2) -> s + ", " + s2);
        if (ingredientsStream.isPresent()){
            ingredientsTmp = ingredientsStream.get();
        }
        return  brandName + " {" +
                "\n bread=" + bread.getName() +
                "\n ingredients= " + ingredientsTmp +
                "\n price=" + price + " PLN" +
                '}';
    }
}
