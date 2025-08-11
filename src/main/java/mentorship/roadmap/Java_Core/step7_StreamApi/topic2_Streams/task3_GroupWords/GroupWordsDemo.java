package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task3_GroupWords;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "ant", "banana", "berry", "cherry", "carrot");
        Map<Character, List<String>> ksd = list.stream()
                .collect(Collectors.groupingBy(x -> x.charAt(0)));
        ksd.forEach((k,v )-> System.out.println("Key : " + k + " | value : " + v));

    }
}
