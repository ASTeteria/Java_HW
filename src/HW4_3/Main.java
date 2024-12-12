package HW4_3;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        HashSet<Person> persons = new HashSet<>();
        persons.add(new Person(1, "Vasya", "Pupkin", "asd@asd.com", 31, Gender.MALE,
                Arrays.asList(new Skill("java", 10), new Skill("js", 10), new Skill("c++", 10)),
                new Car("Toyota", 2021, 250)));
        persons.add(new Person(2, "Petro", "Ivanov", "petro@asd.com", 28, Gender.MALE,
                Arrays.asList(new Skill("java", 8), new Skill("python", 5)),
                new Car("BMW", 2018, 300)));
        persons.add(new Person(3, "Oksana", "Shevchenko", "oksana@asd.com", 25, Gender.FEMALE,
                Arrays.asList(new Skill("html", 3), new Skill("css", 2)),
                new Car("Honda", 2020, 180)));
        persons.add(new Person(4, "Iryna", "Koval", "iryna@asd.com", 30, Gender.FEMALE,
                Arrays.asList(new Skill("js", 6), new Skill("react", 4)),
                new Car("Mazda", 2019, 200)));
        persons.add(new Person(5, "Dmytro", "Kryvonos", "dmytro@asd.com", 35, Gender.MALE,
                Arrays.asList(new Skill("java", 15)),
                new Car("Ford", 2022, 320)));
        persons.add(new Person(6, "Olha", "Tkachenko", "olha@asd.com", 29, Gender.FEMALE,
                Arrays.asList(new Skill("python", 7), new Skill("django", 5)),
                new Car("Tesla", 2021, 400)));
        persons.add(new Person(7, "Ivan", "Mazepa", "ivan@asd.com", 40, Gender.MALE,
                Arrays.asList(new Skill("c#", 10), new Skill("unity", 8)),
                new Car("Volvo", 2017, 250)));
        persons.add(new Person(8, "Anna", "Ivanova", "anna@asd.com", 27, Gender.FEMALE,
                Arrays.asList(new Skill("php", 4)),
                new Car("Hyundai", 2020, 200)));
        persons.add(new Person(9, "Mykola", "Petrov", "mykola@asd.com", 33, Gender.MALE,
                Arrays.asList(new Skill("kotlin", 6), new Skill("android", 7)),
                new Car("Jeep", 2019, 300)));
        persons.add(new Person(10, "Svitlana", "Zhuk", "svitlana@asd.com", 23, Gender.FEMALE,
                Arrays.asList(new Skill("ruby", 5), new Skill("rails", 5)),
                new Car("Subaru", 2018, 220)));


        persons.removeIf(person -> person.getGender() == Gender.MALE);

        System.out.println("Залишені:");
        persons.forEach(System.out::println);

        TreeSet<Person> sortedPersons = new TreeSet<>(Comparator.comparingInt(p -> p.getSkills().size()));
        sortedPersons.addAll(persons);

        System.out.println("Відсортовані за кількістю навичок:");
        sortedPersons.forEach(System.out::println);
    }
}

