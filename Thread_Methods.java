public class Thread_Methods {

    public static void main(String[] args) {

        System.out.println("Main Thread Start");

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }

        });
        t1.start();
        try {
            t1.join(); // let the t1 thread first complete ts execution
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(t1.getState());

        System.out.println("Main Thread Ends");
        System.out.println(Thread.currentThread().getName());
    }
}

/*
 * join()
 * 
 * Main Thread --> WAITING
 * t1 Thread --> RUNNABLE --> TERMINATED
 * Main Thread --> RUNNABLE --> TERMINATED
 * 
 * 
 * 
 * 
 */