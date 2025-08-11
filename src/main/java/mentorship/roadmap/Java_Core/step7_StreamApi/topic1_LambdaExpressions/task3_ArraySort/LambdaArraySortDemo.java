package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task3_ArraySort;

import java.util.Arrays;

public class LambdaArraySortDemo {
    public static void main(String[] args) {
        String[] strings = {"Java", "Lambda", "Stream", "API"};
        Arrays.sort(strings,(o1,o2) -> o1.length() - o2.length()); //idk why i should use comparator, cause
//        Arrays.sort(strings); same answer
        System.out.println("Array sorted by string length: " + Arrays.toString(strings) );
    }
}
