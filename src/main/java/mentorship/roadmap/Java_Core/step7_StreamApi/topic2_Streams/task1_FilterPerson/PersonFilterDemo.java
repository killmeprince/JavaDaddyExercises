package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task1_FilterPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonFilterDemo {
    public static void main(String[] args) {
        Person person = new Person("a", 1);
        Person person1 = new Person("b", 233);
        Person person2 = new Person("c", 3);
        Person person3 = new Person("d", 4);
        Person person4 = new Person("e", 5);
        Person person5 = new Person("j", 6);

        List<Person> list = Arrays.asList(person,person1,person2,person3,person4,person5);
        list.stream()
                .filter(x -> x.getAge() > 30)
                .forEach(System.out::println);


    }
}
