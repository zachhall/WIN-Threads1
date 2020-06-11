import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadTest2 {
    public static void main(String[] args) {
        addThreadToPool();
    }

    public static void addThreadToPool() {
        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, TimeUnit.SECONDS);

        System.out.println("Number of threads: " + Thread.activeCount());

        Thread[] listOfThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(listOfThreads);

        // What are all the threads currently running?
        for(Thread i : listOfThreads) {
            System.out.println(i.getName());
        }

        // What priority does each thread have?
        // main() has a priority of 5, all threads created by main() will also have 5
        // 10 is highest, 1 is lowest
        for(Thread i : listOfThreads) {
            System.out.println(i.getPriority());
        }

        // Shutdown any/all threads running
        // eventPool.shutdown();

        try {
            Thread.sleep(20000);
        } catch(InterruptedException e) {

        }
    }
}