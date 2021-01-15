package streamAPI.mainMethod;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
//        females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream().
                sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
//        sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 17);
//        System.out.println(allMatch);

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 18);
//        System.out.println(anyMatch);

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().startsWith("Z"));
//        System.out.println(noneMatch);

        // Max-min
        people.stream()
                .max(Comparator.comparing(Person::getAge));
//                .ifPresent(System.out::println);
        Optional<Person> min = people.stream()
                .min(Comparator.comparing(Person::getAge));

        // Group
        Map<Position, List<Person>> groupByPosition = people.stream()
                .collect(Collectors.groupingBy(Person::getPosition));

//        groupByPosition.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        });

        // map
        Stream<String> stringStream = people.stream()
                .filter(person -> person.getAge() > 30)
                .map(Person::getName);

//        stringStream.forEach(System.out::println);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Robert Fly", 45, Gender.MALE, Position.DIRECTOR),
                new Person("Mike Rand", 34, Gender.MALE, Position.MANAGER),
                new Person("Ann McFly", 23, Gender.FEMALE, Position.DEV),
                new Person("David Hunter", 19, Gender.MALE, Position.DEV),
                new Person("Aidana Return", 22, Gender.FEMALE, Position.DEV),
                new Person("Kristina Detr", 46, Gender.FEMALE, Position.DEV),
                new Person("Alina Smith", 34, Gender.FEMALE, Position.MANAGER),
                new Person("Sam Dew", 18, Gender.MALE, Position.DEV)
        );
    }
}
