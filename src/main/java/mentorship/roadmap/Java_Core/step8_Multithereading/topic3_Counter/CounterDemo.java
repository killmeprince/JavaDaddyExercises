package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

import java.util.Scanner;

import static java.lang.System.*;

public final class CounterDemo {
    public static void main(final String... args)
            throws InterruptedException {
         final Counter counter = new Counter();
         try (Scanner sc = new Scanner(in)){


         out.println("PASTE INCREMENT TIMES");

         final int scanned = sc.nextInt();
//         final int amountOfIncrement = 100;
         final Runnable runner1 = () -> counter.increment(scanned);
         final Thread thread1 = new Thread(runner1);
         final Thread thread2 = new Thread(runner1);

         thread1.start();
         thread2.start();

         thread1.join();
         thread2.join();
         }

        out.println(counter.getCount());

    }
}
