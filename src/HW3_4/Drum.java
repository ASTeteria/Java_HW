package HW3_4;

import lombok.Data;

@Data

public class Drum implements Instrument {
    private String size;

    public Drum(String size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Play DRAM: " + size);
    }
}

