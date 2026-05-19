package thread.control;
import static thread.start.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");

        log("myThread.state = " + thread.getState()); // NEW - start 호출 전
        log("myThread.start()");
        thread.start();

        Thread.sleep(1000);
        log("myThread.state3 = " + thread.getState()); // TIMED_WAITING - start 호출 후 (sleep, wait, join 호출시)

        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState()); // TERMINATED - 종료
        log("end");
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {

            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState()); // RUNNABLE - 실행 가능 상태
                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");
                log("myThread.state4 = " + Thread.currentThread().getState()); // RUNNABLE - 실행 가능 상태
                log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
