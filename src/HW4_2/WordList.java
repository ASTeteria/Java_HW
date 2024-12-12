package HW4_2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;

@Getter
@Setter
public class WordList {
    private ArrayList<String> words;

    public WordList() {
        words = new ArrayList<>();

        words.add("яблуко");
        words.add("груша");
        words.add("банан");
        words.add("миша");
        words.add("пес");
        words.add("машина");
        words.add("будинок");
        words.add("дерево");
        words.add("курка");
        words.add("телевізор");
        words.add("річка");
        words.add("болото");
        words.add("скеля");
        words.add("місто");
        words.add("село");
        words.add("храм");
        words.add("літо");
        words.add("осінь");
        words.add("зима");
    }

    public void sortWords() {
        Collections.sort(words);
    }
}

