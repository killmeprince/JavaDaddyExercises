package mentorship.roadmap.Java_Core.step8_Multithereading.topic4_ProducerConsumer;

import java.util.*;

import static java.lang.System.*;
import static java.lang.Thread.*;

public final class ProducerConsumerDemo {

    private final static Object lock = new Object();
    private static final int bufferSize = 5;
    private static final Queue<Integer> buffer = new LinkedList<>();

    public static void main(final String... args) {

        final Runnable producer = () -> {
            Random random = new Random();
            try {
                while (true) {
                    synchronized (lock) {
                        while (buffer.size() == bufferSize) {
                            lock.wait();
                        }
                        int genRes = random.nextInt(1, 100000);
                        buffer.add(genRes);
                        out.println("Value added: " + genRes);
                        lock.notifyAll();
                    }
//                    sleep(500);
                }

            } catch (InterruptedException ex) {
                currentThread().interrupt();
                err.println(ex.getMessage());
            }

        };

        final Runnable consumer = () -> {
            try {
                while(true) {
                    synchronized (lock) {
                        while (buffer.isEmpty()) {
                            lock.wait();
                        }
                        int value = buffer.poll();
                        out.println("Value out: " + value);
                        lock.notifyAll();
                    }
//                    sleep(500);
                }
            } catch (InterruptedException ex) {
                currentThread().interrupt();
                err.println(ex.getMessage());
            }
        };

        final Thread thread = new Thread(producer);
        final Thread thread1 = new Thread(consumer);


        thread.start();
        thread1.start();

    }
}
