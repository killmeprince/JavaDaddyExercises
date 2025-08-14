package mentorship.roadmap.Java_Core.step8_Multithereading.topic1_MyThread;

import static java.lang.System.*;

public final class ThreadExtendDemo {
    public static void main(final String... args)
            throws InterruptedException {

        final MyThread myThread1 = new MyThread();
        final MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        myThread1.join();
        myThread2.join();

        out.println("THREADS DONE");
    }
}
