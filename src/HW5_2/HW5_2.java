package HW5_2;

public class HW5_2 {
    public static void main(String[] args) {
        NumberTask task = new NumberTask();

        int[] numbers = task.NumberArray();
        System.out.println("Всі числа:");
        task.printArray(numbers);

        int[] sortNumber = task.sortNumbers(numbers);
        System.out.println("Відсортовані числа:");
        task.printArray(sortNumber);

        int[] filterNumbersOfThree = task.filterOfThree(numbers);
        System.out.println("Числа кратні 3:");
        task.printArray(filterNumbersOfThree);

        int[] filterNumbersOfTen = task.filterOfTen(numbers);
        System.out.println("Числа кратні 10:");
        task.printArray(filterNumbersOfTen);

        int[] tripleNumbers = task.tripletNumber(numbers);
        System.out.println("Збільшені в 3 рази:");
        task.printArray(tripleNumbers);
    }
}
