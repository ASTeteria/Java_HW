package HW3_3;

import lombok.Data;

@Data

public class Book implements Printable {
    private String title;
    private String author;

    @Override
    public void print() {
        System.out.println("Book: " + title + ", author: " + author);
    }
}
