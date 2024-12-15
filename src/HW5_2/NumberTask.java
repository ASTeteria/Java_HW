//- Створити масив з 20 числами.
//- за допомогою способу sorted відсортувати масив.
//-- за допомогою filter отримати числа кратні 3
//-- за допомогою filter отримати числа кратні 10
//-- перебрати (проітерувати) масив за допомогою foreach()
//-- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші

package HW5_2;

import java.util.Arrays;

public class NumberTask {

    public int[] NumberArray() {
        return new int[]{1, 2, 3, 12, 5, 220, 32, 45, 8, 4, 15, 21,
                9, 10, 39, 6, 50, 19, 120, 27};
    }


    public int[] sortNumbers(int[] numbers) {
        return Arrays.stream(numbers).sorted().toArray();
    }

    public int[] filterOfThree(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 3 == 0).toArray();
    }

    public int[] filterOfTen(int[] numbers) {
        return Arrays.stream(numbers).filter(n -> n % 10 == 0).toArray();
    }

    public int[] tripletNumber(int[] numbers) {
        return Arrays.stream(numbers).map(n -> n * 3).toArray();
    }

    public void printArray(int[] numbers) {
        Arrays.stream(numbers).forEach(System.out::println);
    }
}