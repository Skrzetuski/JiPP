package pl.san;

import pl.san.delivery.SandwichBox;
import pl.san.enums.PAYMENT;
import pl.san.model.bread.Ciabatta;
import pl.san.model.bread.Pita;
import pl.san.model.ingredient.*;
import pl.san.sandwich.Sandwich;
import pl.san.sandwich.SandwichMaker;

public class SandwichBar {

    public static void main(String[] args) {

        System.out.println(SandwichMaker.makeSandwich(
                new Ciabatta(),
                new Mayonnaise(),
                new Cheese(),
                new Cheese(),
                new RoastedBeef(),
                new Lettuce(),
                new Lettuce(),
                new Tomato(),
                new Onion()));
        System.out.println();

        Sandwich sandwich = SandwichMaker.makeSandwich(new Pita(), new Cheese(), new Tomato());
        System.out.println(sandwich);

        SandwichBox sandwichBox = new SandwichBox(sandwich);
        sandwichBox.sandwichInfo();
        sandwichBox.paymentMethod(PAYMENT.CASH);
        System.out.println("\n"+sandwichBox);
    }
}
