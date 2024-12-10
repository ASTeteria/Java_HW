package HW3_4;

import lombok.Data;

@Data

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Play TRUMPET with diametr: " + diameter + " см");
    }
}

