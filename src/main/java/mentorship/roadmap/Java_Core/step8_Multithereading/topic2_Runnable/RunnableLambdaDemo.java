package mentorship.roadmap.Java_Core.step8_Multithereading.topic2_Runnable;

import static java.lang.System.*;

public final class RunnableLambdaDemo {
    public static void main(final String... args)
            throws InterruptedException {

        final Runnable runner1 = () -> out.println("Task 1 is running");
        final Runnable runner2 = () -> out.println("Task 2 is running");

        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
