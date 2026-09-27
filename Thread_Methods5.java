public class Thread_Methods5 {

    public static void main(String[] args) {

        Thread t1 = new Thread(()->{
            System.out.println("Custom thread running");
        });



         Thread t2 = new Thread(()->{
            System.out.println("Custom-2 thread running");
        });


        t1.start();
        t2.start();
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        
        System.out.println(t1.getPriority());


        

    }

    /*
      Thread Priority
      MAX_PRIORITY = 10
      MIN_PRIORITY = 0
      NORM_PRIORITY = 5


      Depends on os
      --> may respect priority
      --> may partially respect
      --> may not at all
    
    
    */
    
}
