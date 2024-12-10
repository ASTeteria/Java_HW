package HW3_4;

public class HW3_4 {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(7),
                new Drum("Big"),
                new Trumpet(10)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}