package HW3_1;


import lombok.Data;

import lombok.ToString;

@Data

@ToString(callSuper = true)
public class Ultrabook extends Laptop {
    private double weight;
    private double batteryLife;
}