package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task7_JoinStrings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsDemo {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("red", "green", "blue", "yellow");
        String s = list.stream()
                .collect(Collectors.joining(", "));
        System.out.println(s);

    }
}
