import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WriteAndRead {
    public void writeCarsToFile(String filePath, List<Car> cars) {
        try{
            Files.write(Path.of(filePath),
                    cars.stream()
                            .map(Car::toString)
                            .toList());
            System.out.println("Дані записано у файл: " + filePath);
        } catch (IOException e) {
            System.out.println("Помилка запису : " + e.getMessage());
        }
    }
    public List<String> readCarsToFile(String filePath) {
        try {
            return Files.readAllLines(Path.of(filePath));
        } catch (IOException e) {
            System.err.println("Помилка читання : " + e.getMessage());
            return List.of();
        }
    }

}


