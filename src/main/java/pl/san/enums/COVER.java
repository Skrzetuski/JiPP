package pl.san.enums;

import lombok.Getter;
import java.math.BigDecimal;

@Getter
public enum COVER {
    PAPER_COVER(new BigDecimal("0.05")),
    ALUMINIUM_COVER(new BigDecimal("0.10")),
    PLASTIC_COVER(new BigDecimal("0.15"));

    private final BigDecimal price;

    COVER(BigDecimal price){this.price = price;}

    public String getName(){
        return COVER.super.name().replace("_COVER", " ").toLowerCase();
    }
}