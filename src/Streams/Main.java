package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String []args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Koni", 15000));
        people.add(new Person("Arei", 10000));
        people.add(new Person("Mist", 50000));
        people.add(new Person("Niux", 50000));
        people.add(new Person("Synx", 999));

        /*
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparing(person -> person.name))
                .collect(Collectors.toList());

        sortedList.forEach(person -> System.out.println(person.name));
         */

        List<Person> richSortedClub = people.stream()
                        .filter(person -> person.money >= 1000)
                                .sorted(Comparator.comparing(person -> person.name))
                                        .collect(Collectors.toList());

        richSortedClub.forEach(person -> System.out.println(person.name));

        /*
        people.stream().filter(person -> person.money >= 1000)
                .collect(Collectors.toList());

        for (Person person : people) {
            if (person.money >= 1000) {
                rich.add(person);
            }
        }

        rich.forEach(person -> System.out.println(person.name));
        */
    }
}