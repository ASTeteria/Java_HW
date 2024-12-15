//Створити клас автомобіля з полями:
//Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//Власник автомобіля теж має бути обєкт, у якого є поля
//Імя, вік, стаж водіння.
//Створити не менше 7 та не більше 20 машинок.
//Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
//Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
//Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
//Все через stream API

package HW5_3;

import java.util.ArrayList;
import java.util.List;

public class HW5_3 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>( List.of(
                new Car("Slavuta", 120, new Owner("Vasya",27, 6),2000, 2012 ),
                new Car("Mazda", 200, new Owner("Petya",19, 5),2300, 2010 ),
                new Car("Zaporozhec", 110, new Owner("Masya",22, 4),2000, 2005 ),
                new Car("Reno", 130, new Owner("Vova",25, 3),19888, 2012 ),
                new Car("Nubira", 150, new Owner("Lena",28, 2),1069, 2008 ),
                new Car("Buhanka", 100, new Owner("Misha",20, 1),1000, 2009 ),
                new Car("Niva", 150, new Owner("Kolya",22, 10),2365, 2010 ),
                new Car("Lanos", 190, new Owner("Igor",23, 11),2456, 2012 ),
                new Car("Sens", 120, new Owner("Venya",29, 1),2008, 2011 ),
                new Car("Zhiguli", 150, new Owner("Zenya",30, 12),20002, 2012 ),
                new Car("GreatWall", 100, new Owner("Ksenya",31, 3),21000, 2006 ),
                new Car("Briliance", 90, new Owner("Manya",19, 1),1999, 2001 )

        ));
        CarTask task = new CarTask();


        task.repairPower(cars);
        System.out.println("Ремонтовані"+" "+ cars);

        task.chekDriver(cars);


        double totalPrice = task.calcTotalPrice(cars);
        System.out.println("Загальна вартість всіх авто"+" "+totalPrice);
    }
}
