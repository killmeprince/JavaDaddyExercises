package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task9_PersonToMap;

import mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonToMapDemo {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("%1", 1),
                new Person("%2", 2),
                new Person("%3", 3),
                new Person("%4", 4),
                new Person("%5", 5)
        );
        Map<String,Integer> ls = list.stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        Person::getAge
                ));
        System.out.println(ls);
    }
}
