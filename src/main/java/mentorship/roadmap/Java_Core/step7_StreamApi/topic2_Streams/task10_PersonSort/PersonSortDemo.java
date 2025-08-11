package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task10_PersonSort;

import mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PersonSortDemo {
    public static void main(String[] args) {
        List<mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person> list = Arrays.asList(
                new mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person("%1", 1),
                new mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person("%2", 2),
                new mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person("%3", 3),
                new mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson.Person("%4", 4),
                new Person("%5", 5),
                new Person("%325", 5777777),
                new Person("%22225", -5777777)
        );
//        list.stream().sorted((o1, o2) -> o1.getAge() != o2.getAge()
//                ? Integer.compare(o1.getAge(), o2.getAge())
//                : o1.getName().compareTo(o2.getName()))
//                .forEach(System.out::println);

        list.stream()
                .sorted(Comparator.comparingInt(Person::getAge)
                .thenComparing(Person::getName))
                .forEach(System.out::println);
    }
}
