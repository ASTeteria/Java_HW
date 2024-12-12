package HW4_4;

import lombok.Data;
import java.util.*;

@Data
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    // Додати учасника
    public void addMember(Person person) {
        if (!club.containsKey(person)) {
            club.put(person, new ArrayList<>());
        }
    }

    // Додати тварину
    public void addPetToMember(Person person, Pet pet) {
        club.computeIfAbsent(person, k -> new ArrayList<>()).add(pet);
    }

    // Видалити тварину
    public void removePetFromOwner(Person person, Pet pet) {
        List<Pet> pets = club.get(person);
        if (pets != null) {
            pets.remove(pet);
        }
    }

    // Видалити учасника
    public void removeMember(Person person) {
        club.remove(person);
    }

    // Видалити конкретну тварину
    public void removePetFromAllOwners(Pet pet) {
        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            List<Pet> pets = entry.getValue();
            pets.remove(pet);
        }
    }

    public void printZooClub() {

        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
            Person person = entry.getKey();
            List<Pet> pets = entry.getValue();
            System.out.println(person.getFirstName() + " " + person.getLastName() + " has pets: ");

            for (Pet pet : pets) {
                System.out.println(" - " + pet.getName() + " " + pet.getClassification() );
            }
        }
    }
}
