public class Thread_Methods6 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            while (true) {
                System.out.println("Running");
            }
        });

        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}

/*
 * 
 * Daemon Threads --> Background running Threads
 * --> stop immediately once main thread is completed
 * 
 * 
 * Thread --> User Threads, Daemon Threads
 * 
 * Garbage collection --> Daemon Thread
 * 
 * 
 * 
 */