package mentorship.roadmap.Java_Core.step8_Multithereading.topic1_MyThread;

public final class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread %s says: Hello from thread!".formatted(Thread.currentThread().getName()));
    }
}
