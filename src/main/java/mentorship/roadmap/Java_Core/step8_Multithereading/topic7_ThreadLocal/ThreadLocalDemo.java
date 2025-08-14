package mentorship.roadmap.Java_Core.step8_Multithereading.topic7_ThreadLocal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.System.out;
import static java.lang.Thread.*;

public class ThreadLocalDemo {
    private final static int SIZE = 100;


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);
        ExecutorService executor = Executors.newFixedThreadPool( 10);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            Callable<Integer> task = ()-> {
                for (int j = 0; j < SIZE; j++) {
                    counter.set(counter.get() + 1);


                }
                out.printf("th %s counter : %d + \n", currentThread().getName(), counter.get() );
                return counter.get();
            };

            futures.add(executor.submit(task));
        }
        executor.shutdown();
        if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
            out.println("Tasks didnot finish in time");
        }
        for (Future<Integer> f: futures) {
            out.println(f.get());
        }

    }
}
