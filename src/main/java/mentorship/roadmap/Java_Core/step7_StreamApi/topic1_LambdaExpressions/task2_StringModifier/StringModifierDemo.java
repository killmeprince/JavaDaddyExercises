package mentorship.roadmap.Java_Core.step7_StreamApi.topic1_LambdaExpressions.task2_StringModifier;

public class StringModifierDemo {
    public static void main(String[] args) {
        StringModifier stringModifier = (s -> s.toUpperCase() + "!");
        String lower = "upper";
        System.out.println(stringModifier.modify(lower));

    }

}
