package HW3_2;

import lombok.Data;

import lombok.ToString;
@Data

@ToString(callSuper = true)
public class Comics extends Book {
    private String superhero;
    private boolean agelimit; // Наприклад, true для 18+
}
