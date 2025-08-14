package mentorship.roadmap.Java_Core.step8_Multithereading.topic9_RaceCondition;

import static java.lang.System.*;

public final class RaceConditionDemo {

    private static int counter;
    private static int limit = 1000;

    //not sync
    private static final Runnable task = () -> {
        for (int i = 0; i < limit; i++) {
            counter++;
            if (i % 100000 == 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    };

    //sync
    private static final Runnable rightTask = () -> {
      synchronized (RaceConditionDemo.class) {
          for (int i = 0; i < limit; i++) {
              counter++;
          }
      }

    };
    public static int getCounter() {
        return counter;
    }

    public static void main(final String... args)
            throws InterruptedException {
        Thread th1 = new Thread(rightTask);
        Thread th2 = new Thread(rightTask);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        out.println("threads done");

        out.println(getCounter());
    }
}
