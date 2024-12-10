package HW3_2;

import lombok.Data;

import lombok.ToString;
@Data

@ToString(callSuper = true)
public class Magazine extends Book {
    private int number;
    private boolean colour;
}

