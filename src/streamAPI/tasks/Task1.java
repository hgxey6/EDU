package streamAPI.tasks;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*Прочтитать текст из файла и вывести число слов, которые состоят из 10 букв и больше*/
public class Task1 {
    public static void main(String[] args) {
        try {
            // read file
            String contents = Files.readString(Paths.get("src/streamAPI/tasks/task1.txt"));
            List<String> words = Arrays.asList(contents.split("\\PL+"));// split words

//            int count = 0;
//            for (String w : words) {
//                if (w.length() > 10) count++;
//            }

            long count = words.stream()// process with a stream
                    .filter(w -> w.length() > 10)
                    .count();

            System.out.println(count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
