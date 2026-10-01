public class Thread_Lock2 {
    public static void main(String[] args) {


        Test test = new Test();

        Thread t1 = new Thread(()->test.m1());

        Thread t2 = new Thread(()->test.m2());

        t1.start();
        t2.start();
        
    }
    
}


class Test{



   synchronized void m1(){

         System.out.println("m1 entry"+Thread.currentThread().getName());
        try {

            Thread.sleep(2000);
            
        } catch (Exception e) {
            // TODO: handle exception
        }

       System.out.println("Inside m1 :"+Thread.currentThread().getName());

       System.out.println("m1 exit"+Thread.currentThread().getName());

    }


  synchronized void m2(){

        System.out.println("m2 enters"+Thread.currentThread().getName());

        try {

            Thread.sleep(2000);
            
        } catch (Exception e) { }

        System.out.println("Inside m2: "+Thread.currentThread().getName());

        System.out.println("m2 exit"+Thread.currentThread().getName());
    }





}
    

