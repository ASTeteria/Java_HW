package HW3_2;

public class HW3_2 {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus();
        papyrus.setMaterial("Bumaga");
        papyrus.setLength(300);
        System.out.println(papyrus);

        Book book = new Book();
        book.setMaterial("Bumaga");
        book.setLength(200);
        book.setAutor("Artem Teteria");
        book.setName("Travel in sphere");
        System.out.println(book);

        Magazine magazine = new Magazine();
        magazine.setMaterial("Glyanec");
        magazine.setLength(25);
        magazine.setAutor("SSS");
        magazine.setName("SSSS");
        magazine.setNumber(2);
        magazine.setColour(true);
        System.out.println(magazine);

        Comics comics = new Comics();
        comics.setMaterial("Glyanec");
        comics.setLength(12);
        comics.setAutor("Dvarfs");
        comics.setName("Troll");
        comics.setSuperhero("Troll");
        comics.setAgelimit(true);
        System.out.println(comics);
    }
}