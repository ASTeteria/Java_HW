package HW3_1;

import lombok.Data;

import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Laptop extends PC {
    private double screenSize;
    private boolean hasTouchScreen;
}