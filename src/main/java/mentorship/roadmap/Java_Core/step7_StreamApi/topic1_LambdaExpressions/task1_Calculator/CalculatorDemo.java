package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task1_Calculator;

public class CalculatorDemo{
    public static void main(String[] args) {
        Calculator calc = (a,b) -> a + b;
        int res = calc.operate(122,333);
        System.out.println(res);

    }
}
