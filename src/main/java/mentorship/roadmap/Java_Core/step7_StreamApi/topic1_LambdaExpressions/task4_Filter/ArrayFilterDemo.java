package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task4_Filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArrayFilterDemo {
    static <T> List<T> filterArray(T[] array, MyPredicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : array) if (predicate.test(t)) result.add(t);
        return result;
    }
    public static void main(String[] args) {
        Integer[] arrr = {5, 12, 7, 20, 3};
        MyPredicate<Integer> predicate = (x) -> (x > 10);
        System.out.println(filterArray(arrr, predicate));

    }
}
