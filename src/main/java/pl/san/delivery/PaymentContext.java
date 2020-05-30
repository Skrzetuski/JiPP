package pl.san.delivery;

import pl.san.enums.PAYMENT;

public final class PaymentContext {

    private PAYMENT payment;

    public void set(PAYMENT payment) {
        this.payment = payment;
    }

    public void pay() {
        System.out.println("You paid by " + payment.getName());
    }
}