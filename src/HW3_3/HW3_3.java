package HW3_3;

public class HW3_3 {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book() {{
                    setTitle("Run men");
                    setAuthor("Steve Jobs");
                }},
                new Magazine() {{
                    setName("Atlas");
                    setIssueNumber(20);
                }}
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}



