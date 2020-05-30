package pl.san.interfaces;

import pl.san.delivery.PaymentContext;
import pl.san.delivery.SandwichBox;
import pl.san.enums.COVER;
import pl.san.enums.PAYMENT;
import pl.san.enums.TWINE;
import pl.san.sandwich.Sandwich;

public interface Takeaway {

    default SandwichBox packageSandwich(Sandwich sandwich) {
        var newPrice = sandwich.getPrice().add(TWINE.COTTON_TWINE.getPrice()).add(COVER.PAPER_COVER.getPrice());
        sandwich.setPrice(newPrice);
        return new SandwichBox(sandwich);
    }

    default void paymentMethod(PAYMENT payment) {
        PaymentContext ctx = new PaymentContext();
        ctx.set(payment);
        ctx.pay();
    }

    void sandwichInfo();
}
