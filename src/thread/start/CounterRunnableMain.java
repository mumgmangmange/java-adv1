package thread.start;

import static thread.start.MyLogger.log;

public class CounterRunnableMain {
    public static void main(String[] args) {
//        CounterRunnable counterRunnable = new CounterRunnable();
//        Thread thread = new Thread(counterRunnable);

        Runnable runnable = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    log("value: " + i);
                    Thread.sleep(1000L);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();


    }
}
