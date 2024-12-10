package HW3_3;

import lombok.Data;

@Data

public class Magazine implements Printable {
    private String name;
    private int issueNumber;

    @Override
    public void print() {
        System.out.println("Magazine: " + name + ", number: " + issueNumber);
    }
}

