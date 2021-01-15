package streamAPI.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    //  Определите среднюю длину строки в заданном конечном потоке символьных строк
    public static void main(String[] args) throws IOException {

        String text = Files.readString(Paths.get("src/streamAPI/tasks/task3.txt/"));
        List<String> strings = Arrays.asList(text.split("\\PL+"));
        System.out.println(
                strings.stream()
                        .map(String::length)
                        .mapToInt(x -> x).sum()
                        / strings.size()); //

    }
}
