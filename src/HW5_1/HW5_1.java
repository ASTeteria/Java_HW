package HW5_1;

import java.util.List;

public class HW5_1 {
    public static void main(String[] args) {
        WordsTask task = new WordsTask();

        List<String> words = task.createWordList();
        System.out.println(words);

        List<String> words2 = task.sortWordsAlphabet(words);
        System.out.println(words2);

        List<String> words3 = task.filterFourWords(words);
        System.out.println(words3);
    }
}
