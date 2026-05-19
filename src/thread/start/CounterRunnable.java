package thread.start;

import static thread.start.MyLogger.log;

public class CounterRunnable implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                log(i);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
