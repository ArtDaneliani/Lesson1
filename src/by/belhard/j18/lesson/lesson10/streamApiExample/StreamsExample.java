package by.belhard.j18.lesson.lesson10.streamApiExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("person1", 20),
                new Person("person2", 21),
                new Person("person3", 25),
                new Person("person4", 10),
                new Person("person5", 90),
                new Person("person6", 11),
                new Person("person7", 29),
                new Person("person8", 10),
                new Person("person9", 30),
                new Person("person10", 20)
        );

        List<Person> collect = people.stream()
                .filter(p -> p.getAge() > 25)
                .sorted((p1, p2) -> p2.getAge() - p1.getAge())
                .collect(Collectors.toList());

        System.out.println(collect);

        people.stream()
                .filter(p -> p.getAge() > 25)
                .sorted((p1, p2) -> p2.getAge() - p1.getAge())
                .forEachOrdered(p -> System.out.printf("%s : %d",
                        p.getName(), p.getAge()));

        people.stream()
                .filter(new Predicate<Person>() {
                    @Override
                    public boolean test(Person person) {
                        return person.getAge() > 25;
                    }
                })
                .sorted((p1, p2) -> p2.getAge() - p1.getAge())
                .forEachOrdered(System.out::println);
    }
}