package pl.san.model.ingredient;

import lombok.Getter;
import pl.san.model.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public abstract class Ingredient extends Component {

    private final BigDecimal price;

    public Ingredient(String name, double price) {
        super(name, LocalDateTime.now(), LocalDateTime.now().plusDays(1));
        this.price = BigDecimal.valueOf(price);
    }
}
