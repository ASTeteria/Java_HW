package HW4_3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Skill> skills1 = new HashSet<>();
        skills1.add(new Skill("Java", 10));
        skills1.add(new Skill("Python", 5));

        Set<Skill> skills2 = new HashSet<>();
        skills2.add(new Skill("JavaScript", 7));
        skills2.add(new Skill("HTML", 3));

        Set<Skill> skills3 = new HashSet<>();
        skills3.add(new Skill("C++", 15));
        skills3.add(new Skill("C#", 10));

        Set<Skill> skills4 = new HashSet<>();
        skills4.add(new Skill("Kotlin", 8));
        skills4.add(new Skill("Swift", 6));

        Set<Skill> skills5 = new HashSet<>();
        skills5.add(new Skill("Go", 12));
        skills5.add(new Skill("Rust", 10));

        Set<Skill> skills6 = new HashSet<>();
        skills6.add(new Skill("Ruby", 5));
        skills6.add(new Skill("PHP", 4));

        Set<Skill> skills7 = new HashSet<>();
        skills7.add(new Skill("Java", 6));
        skills7.add(new Skill("JavaScript", 8));
        skills7.add(new Skill("SQL", 5));

        Set<Skill> skills8 = new HashSet<>();
        skills8.add(new Skill("Scala", 10));
        skills8.add(new Skill("Elixir", 7));

        Set<Skill> skills9 = new HashSet<>();
        skills9.add(new Skill("Python", 8));
        skills9.add(new Skill("Django", 6));

        Set<Skill> skills10 = new HashSet<>();
        skills10.add(new Skill("Perl", 4));
        skills10.add(new Skill("Shell", 3));

        Car car1 = new Car("Toyota", 2021, 250);
        Car car2 = new Car("BMW", 2022, 200);
        Car car3 = new Car("Audi", 2020, 280);
        Car car4 = new Car("Mercedes", 2021, 240);
        Car car5 = new Car("Ford", 2019, 300);
        Car car6 = new Car("Honda", 2022, 180);
        Car car7 = new Car("Tesla", 2023, 300);
        Car car8 = new Car("Hyundai", 2020, 200);
        Car car9 = new Car("Chevrolet", 2018, 220);
        Car car10 = new Car("Volkswagen", 2021, 210);

        Set<Person> peopleHashSet = new HashSet<>();
        peopleHashSet.add(new Person(1, "Vasya", "Pupkin", "vasya@aaa.com", 31, Gender.MALE, skills1, car1));
        peopleHashSet.add(new Person(2, "Anna", "Ivanova", "vnnvnnv@sss.com", 25, Gender.FEMALE, skills2, car2));
        peopleHashSet.add(new Person(3, "Petya", "Petrov", "sd,mxcn@ddd.com", 35, Gender.MALE, skills3, car3));
        peopleHashSet.add(new Person(4, "Olya", "Petrova", "odfpi@fff.com", 28, Gender.FEMALE, skills4, car4));
        peopleHashSet.add(new Person(5, "Misha", "Mishin", "cmvbcnbv@ggg.com", 40, Gender.MALE, skills5, car5));
        peopleHashSet.add(new Person(6, "Sonya", "Bobr", "[poipiuoi@zzz.com", 23, Gender.FEMALE, skills6, car6));
        peopleHashSet.add(new Person(7, "Oleksiy", "Oleksiev", "jdvdjj@xxx.com", 29, Gender.MALE, skills7, car7));
        peopleHashSet.add(new Person(8, "Masha", "Lesha", "bcvc@vv.com", 34, Gender.FEMALE, skills8, car8));
        peopleHashSet.add(new Person(9, "Kolyan", "Mikolin", "sfffds@bbb.com", 32, Gender.MALE, skills9, car9));
        peopleHashSet.add(new Person(10, "Olena", "Paliy", "elena@mmmm.com", 27, Gender.FEMALE, skills10, car10));

        // Видалення чоловіків
        peopleHashSet.removeIf(person -> person.getGender() == Gender.MALE);

        System.out.println("After removing males:");
        peopleHashSet.forEach(System.out::println);

        //TreeSet
        Set<Person> peopleTreeSet = new TreeSet<>(peopleHashSet);

        System.out.println("Sorted by number of skills:");
        peopleTreeSet.forEach(System.out::println);
    }
}
