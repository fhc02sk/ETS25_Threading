package threadingConsole;

import java.util.Date;

public class DateTimePrinterBackgroundWorker implements Runnable {

    public DateTimePrinterBackgroundWorker() {
    }

    public void worker() {

        while (true) {
            Date d = new Date();
            System.out.println(d);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { // erklärung noch ausständing
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        worker();
    }
}
