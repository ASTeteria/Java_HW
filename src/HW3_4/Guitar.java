package HW3_4;

import lombok.Data;

@Data

public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println("Play GUITAR wuth strings: " + numberOfStrings);
    }
}
