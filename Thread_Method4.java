public class Thread_Method4 {

    public static void main(String[] args) {
        
            Thread t1 = new Thread(()->{
                System.out.println(Thread.currentThread().getName());
            });

             
            t1.setName("Worker 1");
            System.out.println(Thread.currentThread().getName());
            

              t1.start();
         
    }

  
    
}

/*
  currentThread()-->refernce of current running thread.

*/
