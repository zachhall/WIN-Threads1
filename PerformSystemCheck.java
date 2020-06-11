import java.util.concurrent.locks.*;

public class PerformSystemCheck implements Runnable {
    private String checkWhat;
    ReentrantLock lock = new ReentrantLock();

    
    public PerformSystemCheck(String checkWhat) {
        this.checkWhat = checkWhat;
    }

    // adding "synchronized" keyword to run() will keep
    // it from being used by another thread at the same time
    public void run() {
        lock.lock();
    
        System.out.println("Checking " + this.checkWhat);

        lock.unlock();
    }
}