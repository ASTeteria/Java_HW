//Створити клас котрий відповідає наступній моделі
//{
//    id: 1,
//    name: 'vasya',
//    surname: 'pupkin',
//    email: 'asd@asd.com',
//    age: 31,
//    gender: 'MALE',
//    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//    car: {model: 'toyota', year: 2021, power: 250}
//}
//Використати композицію/агрегацію та енуми в потрібному місці.


package HW2_2;
public class HW2_2 {
    public static void main(String[] args) {

        Skill skill1 = new Skill("java", 10);
        Skill skill2 = new Skill("js", 10);
        Skill skill3 = new Skill("c++", 10);


        Car car = new Car("toyota", 2021, 250);


        User user = User.builder()
                .id(1)
                .name("vasya")
                .surname("pupkin")
                .email("asd@asd.com")
                .age(31)
                .gender(Gender.MALE)
                .skills(new Skill[]{skill1, skill2, skill3})
                .car(car)
                .build();


        System.out.println(user);
    }
}