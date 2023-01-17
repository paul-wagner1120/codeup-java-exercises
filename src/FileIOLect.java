import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIOLect {

    public static void main(String[] args) throws IOException {

        String directory = "data";
        String filename = "info.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");

        Path filepath = Paths.get("data", "groceries.txt");

        Files.write(filepath, groceryList);



//        Path groceriesPath = Paths.get("data", "groceries.txt");
        List<String> groceryItems = Files.readAllLines(filepath);

        System.out.println(groceryItems);

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }

        Files.write(
                filepath,
                Arrays.asList("eggs"), // list with one item
                StandardOpenOption.APPEND
        );

        List<String> lines = Files.readAllLines(filepath);
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }

        Files.write(filepath, newList);

    }

}
