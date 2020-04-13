package pl.san.model.bread;

import lombok.Getter;
import pl.san.model.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
public abstract class Bread extends Component {

    private final BigDecimal price;

    public Bread(String name, double price) {
        super(name, LocalDateTime.now(), LocalDateTime.now().plusDays(3));
        this.price = BigDecimal.valueOf(price);
    }
}
