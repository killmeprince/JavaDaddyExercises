package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task6_UniqueValues;

import java.util.Arrays;
import java.util.List;


public class UniqueValuesDemo {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
        list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
