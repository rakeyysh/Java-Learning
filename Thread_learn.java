public class Thread_learn {


    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.run();
        t1.start();       
       
        
        
    }
    
}

class MyThread extends Thread{

@Override 
public void run(){

    System.out.println(Thread.currentThread().getName());
}



}
