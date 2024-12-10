package HW3_2;

import lombok.Data;
import lombok.ToString;
@Data

@ToString(callSuper = true)
public class Book extends Papyrus {
    private String autor;
    private String name;
}