package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task5_Converter;

import java.util.Arrays;

public class ConverterDemo {
    static int[] convertArray(int[] array, Converter converter) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++ ) {
            int res = converter.convert(array[i]);
            result[i] = res;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Converter converter = x -> x * x;
        System.out.println(Arrays.toString(convertArray(arr, converter)));

    }
}
