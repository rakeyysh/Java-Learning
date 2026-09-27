public class Thread_learn2 {

    public static void main(String[] args) {

        // Runnable t = new MyTask();

        Thread t1 = new Thread(() -> System.out.println("running from runnable..."));
        t1.start();
        // t1.start(); // IllegalThreadStateException

    }

}

/*
 * Can we start the same thread twice --> No.
 * 
 */

// class MyTask implements Runnable{

// @Override
// public void run(){
// System.out.println("running from runnable...");
// }

// }