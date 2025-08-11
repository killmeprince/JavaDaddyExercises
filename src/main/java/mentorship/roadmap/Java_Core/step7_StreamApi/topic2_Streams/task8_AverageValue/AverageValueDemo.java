package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task8_AverageValue;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class AverageValueDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();
        optionalDouble.ifPresent(avg -> System.out.println("Average: " + avg));
    }
}
