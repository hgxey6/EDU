package streamAPI.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) throws IOException {
        String text = Files.readString(Paths.get("src/streamAPI/tasks/task2.txt"));
        List<String> words = Arrays.asList(text.split("\\PL+"));// split words

        System.out.println("text length = " + words.size());

        // Stream time
        long start1 = System.currentTimeMillis();
        long stream = words.stream()
                .filter(word -> word.length() > 8)
                .count();
        long finish1 = System.currentTimeMillis();
        System.out.println("stream = " + (finish1 - start1));

        // Parallel Stream time
        long start2 = System.currentTimeMillis();
        long parallelStream = words.parallelStream()
                .filter(word -> word.length() > 8)
                .count();
        long finish2 = System.currentTimeMillis();
        System.out.println("parallel stream = " + (finish2 - start2));
    }
}
