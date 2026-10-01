public class Threads_Lock3 {

    public static void main(String[] args) {

        Box b = new Box();

        Thread Producer = new Thread(() -> {

            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(100);
                    b.producer(i);
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
            }
        });
        Thread Consumer = new Thread(() -> {

            for (int i = 1; i <= 20; i++) {
                try {
                    Thread.sleep(70);
                    b.consumer();
                } catch (Exception e) {
                    // TODO: handle exception
                }
                
            }
        });

        Producer.start();
        Consumer.start();

    }
}

class Box {

    volatile Integer item;
    volatile Boolean flag = false;

     synchronized void producer(int value) throws InterruptedException {

        while (flag == true) {
            wait();
        }


        item = value;
        flag = true;

        System.out.println("Producer produces " + item);
        notify();

    }

     synchronized void consumer() throws InterruptedException {

        while (flag == false) {

            wait();

        }

        System.out.println("Consumer consumes " + item);
        item = null;
        flag = false;
        notify();
    }

}
