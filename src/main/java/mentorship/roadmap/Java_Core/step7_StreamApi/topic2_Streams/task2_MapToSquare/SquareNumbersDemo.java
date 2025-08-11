package mentorship.roadmap.Java_Core.step7_StreamApi.topic2_Streams.task2_MapToSquare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbersDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().map(x -> (int)Math.pow(x,2)).toList().forEach(System.out::println);
    }



}
