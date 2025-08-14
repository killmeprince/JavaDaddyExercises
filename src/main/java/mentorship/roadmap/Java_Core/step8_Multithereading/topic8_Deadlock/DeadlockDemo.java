package mentorship.roadmap.Java_Core.step8_Multithereading.topic8_Deadlock;

import static java.lang.System.*;
import static java.lang.Thread.*;

public final class DeadlockDemo {

    private static final Object lockOne = new Object();
    private static final Object lockTwo = new Object();

    public static void main(final String... args) {
        final Thread thread = new Thread( () -> {
            synchronized (lockOne) {
                out.println(currentThread().getName() + " captured lock 1");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    currentThread().interrupt();
                    err.println(e.getMessage());
                }
                synchronized (lockTwo) {
                    out.println(currentThread().getName() + " captured lock 2");
                }
            }
        });
        final Thread thread1 = new Thread( () -> {
            synchronized (lockTwo) {
                out.println(currentThread().getName() + " captured lock 2");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    currentThread().interrupt();
                    err.println(e.getMessage());
                }
                synchronized (lockOne) {
                    out.println(currentThread().getName() + " captured lock 1");
                }
            }
        });
        thread.start();
        thread1.start();








    }

}
