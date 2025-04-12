package threading04;

public class Counter implements Runnable {

    public static int Counter = 0;
    //private static Object lockObject = "";

    @Override
    public void run() {
        for (int i = 0; i< 1_000_000; i++) {
  //          synchronized (lockObject) {
            //    Counter = Counter + 1;
            increase();

        }
    }

    //synchronized (this)
    private synchronized void increase() {
        Counter = Counter + 1;
    }
}
