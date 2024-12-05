package HW2_2;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public class User {
        private int id;
        private String name;
        private String surname;
        private String email;
        private int age;
        private Gender gender;
        private Skill[] skills;
        private Car car;
    }




