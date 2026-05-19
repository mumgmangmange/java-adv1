package thread.start;

public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("123123");
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
