public class ThreadsTest {
    public static void main(String[] args) {
        Thread getTime = new GetTime20();
        Runnable getMail = new GetNewMail(10);
        Runnable getMailAgain = new GetNewMail(20);

        getTime.start();

        new Thread(getMail).start();
        new Thread(getMailAgain).start();
    }    
}