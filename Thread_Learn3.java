public class Thread_Learn3 {


    public static void main(String[] args) {
        
        // main thread created this thread t1
        Thread Main = Thread.currentThread();
        System.out.println(Main.getName());

        Thread t1 = new Thread(()->{
            System.out.println("Name of the Current Thread is "+ Thread.currentThread().getName());
            System.out.println(Main.getState());
    });
      
        
        System.out.println(t1.getState());     // NEW

         // its the main thread or any othre thread always determines the state of another thread
        // Runnable Stage
        t1.start();

        System.out.println(t1.getState());   // RUNNABLE, TERMINATED
        try {
            Thread.sleep(2000);                      // main thread is on sleep
            
        } catch (Exception e) {
            // TODO: handle exception
        }
      
         System.out.println(t1.getState());   // TERMINATED
    }
    
}
