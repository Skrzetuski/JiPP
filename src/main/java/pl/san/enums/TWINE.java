package pl.san.enums;

import lombok.Getter;
import java.math.BigDecimal;

@Getter
public enum TWINE {
    COTTON_TWINE(new BigDecimal("0.30")),
    NYLON_TWINE(new BigDecimal("0.15"));

    private final BigDecimal price;

    TWINE(BigDecimal price){
        this.price = price;
    }

    public String getName(){
        return TWINE.super.name().replace("_", " ").toLowerCase();
    }
}