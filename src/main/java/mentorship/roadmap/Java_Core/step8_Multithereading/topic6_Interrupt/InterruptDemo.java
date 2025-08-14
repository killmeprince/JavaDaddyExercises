package mentorship.roadmap.Java_Core.step8_Multithereading.topic6_Interrupt;

import static java.lang.System.*;
import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public final class InterruptDemo {
    public static void main(final String... args)
            throws InterruptedException {
        final Runnable task = () -> {
            while(!currentThread().isInterrupted()) {
                out.println("Working " + currentThread().getName());
                try {
                    sleep(500);

                } catch (InterruptedException e) {
                    currentThread().interrupt();
                }
            }
        };
        final Thread thread = new Thread(task);

        thread.start();

        Thread.sleep(3000);

        out.println("interrupted");
        thread.interrupt();

        thread.join();
        out.println("main th finish");


    }
}
