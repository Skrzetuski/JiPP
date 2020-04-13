package pl.san.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode
public abstract class Component {

    public Component(String name, LocalDateTime dateProd, LocalDateTime dateExp) {
        this.name = name;
        this.dateProd = dateProd;
        this.dateExp = dateExp;
        this.UUID = java.util.UUID.randomUUID().toString();
    }

    private final String UUID;

    private final String name;

    private final LocalDateTime dateProd;

    private final LocalDateTime dateExp;

    @Override
    public String toString() {
        return Component.super.getClass().getSimpleName() +
                "{" +
                "UUID='" + UUID + '\'' +
                ", dateProd=" + dateProd +
                ", dateExp=" + dateExp +
                '}';
    }
}
