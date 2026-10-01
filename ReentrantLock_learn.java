import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLock_learn {

    public static void main(String[] args) {

        Resource b = new Resource();
        Thread t1 = new Thread(() -> b.f1());
        Thread t2 = new Thread(() -> b.f1());

        t1.start();
        t2.start();

    }
}

class Resource {

    Lock lock = new ReentrantLock();

    void f1() {
        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + " entered");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println(Thread.currentThread().getName() + " exited");

        } catch (Exception e) {
            // TODO: handle exception
        }

        finally {

            lock.unlock();

        }

    }

}
