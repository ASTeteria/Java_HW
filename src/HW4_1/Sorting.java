package HW4_1;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 25));
        users.add(new User("Charlie", 35));
        users.add(new User("David", 20));
        users.add(new User("Eve", 30));


        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Сортування за віком (збільшення): " + users);

        users.sort((u1, u2) -> Integer.compare(u2.getAge(), u1.getAge()));
        System.out.println("Сортування за віком (зменшення): " + users);

        users.sort(Comparator.comparingInt(u -> u.getName().length()));
        System.out.println("Сортування за довжиною ім'я (збільшення): " + users);

        users.sort((u1, u2) -> Integer.compare(u2.getName().length(), u1.getName().length()));
        System.out.println("Сортування за довжиною ім'я (зменшення): " + users);
    }
}
