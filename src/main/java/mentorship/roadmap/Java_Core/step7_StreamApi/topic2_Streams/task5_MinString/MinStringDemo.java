package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task5_MinString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinStringDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("elephant", "cat", "hippopotamus", "dog", "lion");
//        List<String> list1 = Arrays.asList("","","");
        String min = list.stream()
                .min(Comparator.comparingInt(String::length))
                .toString();
        System.out.println(min);
    }
}
