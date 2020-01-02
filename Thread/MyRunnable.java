package Homework.Thread;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }
    public void go() {
        doMore();
    }
    public void doMore() {
        System.out.println("top 'o the stack");
    }
}

//class MyThread extends Thread {
//    public MyThread(Runnable runnable) {
//
//    }
//    public void start() {
//        System.out.println("start");
//    }
//}

class TheradTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("back in main");
    }
}
