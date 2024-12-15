//створити ArrayList зі словами на 15-20 елементів.
//- відсортувати його за алфавітом .
//*-- відфільтрувати слова довжиною менше 4 символів

package HW5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WordsTask {

    public List<String> createWordList() {
        return new ArrayList<>(List.of(
                "Apple", "Cat", "Dog", "Banana", "Ice", "Water",
                "Fire", "Lion", "Mouse", "Monkey",
                "Orange", "Fat", "Queen", "Rabbit", "Sun", "Sunshine"
        ));
    }


    public List<String> sortWordsAlphabet(List<String> words) {
        return words.stream()
                .sorted()
                .collect(Collectors.toList());
    }


    public List<String> filterFourWords(List<String> words) {
        return words.stream()
                .filter(word -> word.length() >= 4)
                .collect(Collectors.toList());
    }
}
