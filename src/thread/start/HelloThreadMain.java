package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();

        System.out.println(Thread.currentThread().getName() + ": start() 호출");

        helloThread.start(); // 스레드를 실행하는 아주 특별한 메소드 (쓰레드가 생기는것! run() 호출함)
//        Thread.sleep(3000L);
        System.out.println(Thread.currentThread().getName() + ": start() 호출");

        System.out.println(Thread.currentThread().getName() + ": main() end");


//        System.out.println(Thread.currentThread().getName() + ": main() start");
//
//        HelloThread helloThread = new HelloThread();
//        System.out.println(Thread.currentThread().getName() + ": run() 호출");
//        helloThread.run();
//        Thread.sleep(3000L);
//        System.out.println(Thread.currentThread().getName() + ": run() 호출");
//
//        System.out.println(Thread.currentThread().getName() + ": main() end");

    }

}
