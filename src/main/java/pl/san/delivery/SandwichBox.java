package pl.san.delivery;

import lombok.Getter;
import pl.san.enums.COVER;
import pl.san.enums.TWINE;
import pl.san.interfaces.Takeaway;
import pl.san.sandwich.Sandwich;

@Getter
public class SandwichBox implements Takeaway {

    private final Sandwich sandwich;

    private final COVER cover;

    private final TWINE twine;

    public SandwichBox(Sandwich sandwich) {
        this(sandwich, COVER.PAPER_COVER, TWINE.COTTON_TWINE);
    }

    public SandwichBox(Sandwich sandwich, COVER cover, TWINE twine) {
        this.cover = cover;
        this.twine = twine;
        sandwich.setPrice(sandwich.getPrice().add(cover.getPrice().add(twine.getPrice())));
        this.sandwich = sandwich;
    }

    @Override
    public void sandwichInfo() {
        System.out.println(
                "Your sandwich is wrapped on: " + cover.getName() +
                        "and " + twine.getName()
        );
    }

    @Override
    public String toString() {
        return "SandwichBox {\n" +
                " sandwich=" + sandwich +
                "\ncover=" + cover.getName() +
                ", twine=" + twine.getName() +
                '}';
    }
}