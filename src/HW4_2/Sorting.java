package HW4_2;

public class Sorting {
    public static void main(String[] args) {
        WordList wordList = new WordList();
        System.out.println("До сортування: " + wordList.getWords());
        wordList.sortWords();
        System.out.println("Після сортування: " + wordList.getWords());
    }
}

