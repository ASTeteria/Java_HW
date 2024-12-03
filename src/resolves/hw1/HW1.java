package resolves.hw1;

public class HW1 {
    public static void main(String[] args) {

        Book[] books = {
                new Book("Book1", 10, new String[]{"Arthur Conandoil"}, "Opera"),
                new Book("Book2", 2000, new String[]{"Santa", "Claus"}, "Drama"),
                new Book("Book3", 19, new String[]{"Vasya"}, "Adv"),
                new Book("Book4", 256, new String[]{"Misha"}, "Fantasy"),
                new Book("Book5", 453, new String[]{"Golovachov", "Petya"}, "Fantastic")
        };

        for (Book book : books) {
            System.out.println(book);
        }


        Car[] cars = {
                new Car("BMV", 150, 2.0, true),
                new Car("Mercedes", 200, 1.8, false),
                new Car("Opel", 250, 3.0, true),
                new Car("Briliance", 140, 1.6, false),
                new Car("ZAZ", 20, 1.2, true)
        };

        for (Car car : cars) {
            System.out.println(car);
        }


        Dog[] dogs = {
                new Dog("Boy", 3, "Sinberbar"),
                new Dog("Max", 5, "Beagle"),
                new Dog("Charlie", 2, "Poodle"),
                new Dog("Rich", 4, "Buldog"),
                new Dog("Gon", 6, "Taxa")
        };

        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        Posts[] posts = {
                new Posts(1, 1, "World", "Lorem ipsum dolor sit amet"),
                new Posts(2, 2, "Pop", "Lorem ipsum dolor sit amet"),
                new Posts(3, 3, "Rock", "Lorem ipsum dolor sit amet"),
                new Posts(4, 4, "Dudka", "Lorem ipsum dolor sit amet"),
                new Posts(5, 5, "Sopilka", "Lorem ipsum dolor sit amet"),
        };

        for (Posts post : posts) {
            System.out.println(post);
        }


        Comments[] comments = {
                new Comments(1, 1, "Comment1", "uuss@Gmail.com", "lorem ipsum dolor sit amet"),
                new Comments(2, 2, "Comment2", "uuss122@Gmail.com", "lorem ipsum dolor sit amet"),
                new Comments(3, 3, "Comment3", "uuss453@Gmail.com", "lorem ipsum dolor sit amet"),
                new Comments(4, 4, "Comment4", "uusswd@Gmail.com", "lorem ipsum dolor sit amet"),
                new Comments(5, 5, "Comment5", "uussfds@Gmail.com", "lorem ipsum dolor sit amet")
        };

        for (Comments comment : comments) {
            System.out.println(comment);
        }
    }
}
