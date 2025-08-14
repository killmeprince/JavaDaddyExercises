package mentorship.roadmap.Java_Core.step8_Multithereading.topic3_Counter;

import java.util.stream.IntStream;

import static java.util.stream.IntStream.*;

public final class Counter {
    private int count;
    public int getCount(){
        return count;
    }
    public synchronized void increment(int times) {
        range(0, times).forEach(i -> count++);
    }
}
