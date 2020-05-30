package pl.san.enums;

public enum PAYMENT {
    CASH,
    CREDIT_CARD,
    DEBIT_CARD;

    public String getName(){
        return PAYMENT.super.name().replace("_", " ").toLowerCase();
    }
}