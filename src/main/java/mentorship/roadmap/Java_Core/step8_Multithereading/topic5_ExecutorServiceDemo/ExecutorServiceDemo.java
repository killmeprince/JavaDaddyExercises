package mentorship.roadmap.Java_Core.step8_Multithereading.topic5_ExecutorServiceDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.System.*;
import static java.lang.Thread.*;
import static java.util.concurrent.Executors.newFixedThreadPool;


public final class ExecutorServiceDemo {

    public static void main(final String... args)
            throws ExecutionException, InterruptedException {
        final int SIZE = 5;
        final List<Future<String>> futures = new ArrayList<>();
        try (ExecutorService threadPool = newFixedThreadPool(SIZE)) {

            for (int i = 0; i< SIZE; i++) {
                final int taskNum = i;
                Callable<String> task= () -> {
                    String result = "Task №" + taskNum + " executed bi" + currentThread().getName();
                    out.println(result);
                    Thread.sleep(1000);
                    return result;
                };
                futures.add(threadPool.submit(task));
            }
            threadPool.shutdown();
            if (!threadPool.awaitTermination(10,TimeUnit.SECONDS)) {
                out.println("tasks didnot finish in time");
            }
        }

//        for (Future<String> f : futures) {
//            out.println(f.get());
//        }
        out.println("no more tasks");

    }
}
