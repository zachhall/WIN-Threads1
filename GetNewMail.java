public class GetNewMail implements Runnable {
    private int startTime;

    // Simple constructor
    public GetNewMail(int startTime) {
        this.startTime = startTime;
    }

    public void run() {
        try {
            Thread.sleep(startTime * 1000); // converts passed time to milli  
        } catch(InterruptedException e) {

        }
        System.out.println("Checking mail...");
        System.out.println("");
    }
}