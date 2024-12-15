package HW5_3;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String brande;
    private int Power;
    private Owner owner;
    private double price;
    private int year;
}
