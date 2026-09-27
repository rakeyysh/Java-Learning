public class Thread_Methods2 {
    public static void main(String[] args) throws Exception {

        Thread t1 = new Thread(() -> {

            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Running");

            }

        });

        t1.start();
        Thread.sleep(2000);
        t1.interrupt();

    }

}

/*
 * Thread --> interrupt flag (default true)
 * t1.interrupt() --> sends a signal to t1 thread that it should stop doing what
 * its doing.
 * 
 * we can gracefully handle
 * --> You can make a thread run until a condition
 * --> Cancelling a long running task
 * --> use to stop Thread Pool
 * 
 * isInterrupted() --> return interrupt flag value. (T/F)
 * interrupted() --> return interrupt flag value (T/F) but also set it back to
 * false
 * 
 */