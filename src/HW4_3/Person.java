package HW4_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Set<Skill> skills;
    private Car car;

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.skills.size(), o.skills.size());
    }
}

