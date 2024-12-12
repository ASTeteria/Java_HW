package HW4_4;

public class Main {
    public static void main(String[] args) {
        // Зоокдуб
        ZooClub zooClub = new ZooClub();

        // Учасники
        Person vasya = new Person("Vasya", "Petlin");
        Person anna = new Person("Anna", "Kukla");

        zooClub.addMember(vasya);
        zooClub.addMember(anna);

        // Тварини для Васі
        Pet dog1 = new Pet("Rax", "Dog");
        Pet cat1 = new Pet("Whisky", "Cat");
        Pet rabbit1 = new Pet("Fluffy", "Rabbit");

        // Тварини для Анни
        Pet dog2 = new Pet("Bobby", "Dog");
        Pet cat2 = new Pet("Juk", "Cat");
        Pet rabbit2 = new Pet("Rabba", "Rabbit");

        // Додаю тварин
        zooClub.addPetToMember(vasya, dog1);
        zooClub.addPetToMember(vasya, cat1);
        zooClub.addPetToMember(vasya, rabbit1);

        zooClub.addPetToMember(anna, dog2);
        zooClub.addPetToMember(anna, cat2);
        zooClub.addPetToMember(anna, rabbit2);

        zooClub.printZooClub();

        // УВидаляю тварину у Васі
        zooClub.removePetFromOwner(vasya, dog1);

        zooClub.printZooClub();

        // Видаляю тварину у всіх
        zooClub.removePetFromAllOwners(cat1);

        zooClub.printZooClub();

        // Видаляю Васю
        zooClub.removeMember(vasya);

        zooClub.printZooClub();
    }
}


