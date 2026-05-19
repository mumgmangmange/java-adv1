package thread.start;

public class DeamonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start1");

        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setDaemon(true);
        deamonThread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end2");
    }

    static class DeamonThread extends Thread  {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()3");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run()4");
        }
    }
}
