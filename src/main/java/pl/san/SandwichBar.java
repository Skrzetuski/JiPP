package pl.san;

import pl.san.delivery.SandwichBox;
import pl.san.enums.PAYMENT;
import pl.san.model.bread.Ciabatta;
import pl.san.model.bread.Pita;
import pl.san.model.ingredient.*;
import pl.san.sandwich.Sandwich;
import pl.san.sandwich.SandwichMaker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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

        //Task 6
        System.out.println("\nTask 6");

        List<Double> doubles = new ArrayList<>();
        var numbersOfElements = ThreadLocalRandom.current().nextInt(20) + 10;

        for (int i = 0; i < numbersOfElements; i++){
            doubles.add(ThreadLocalRandom.current().nextDouble()*100);
        }

        doubles.sort(Double::compareTo);
        doubles.forEach(System.out::println);

        var avg  = doubles.stream().reduce(Double::sum).get() / doubles.size();

        var median = switch (doubles.size() % 2){
            case 0 -> doubles.get((doubles.size()/2)) + doubles.get((doubles.size()/2 - 1)) / 2.0d;
            default -> doubles.get(doubles.size() / 2);
        };

        System.out.println("Elements = " + doubles.size() + "\nAVG = " + avg + "\nMedian = " + median);
    }
}