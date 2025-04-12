package threadingConsole;

import java.io.IOException;

public class ThreadingConsoleApp {

    public static void main(String[] args) throws InterruptedException {
        DateTimePrinterBackgroundWorker backgroundWorker = new DateTimePrinterBackgroundWorker();

        Thread th = new Thread(backgroundWorker);
        th.start();

        try {
            // Warten auf ein Zeichen
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Zeichen eingelesen
        System.out.println("stopp!");
        th.join();
        System.out.println("ende erreicht");
    }
}
