public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CallCounterThread1 t1 = new CallCounterThread1(counter);
        CallCounterThread2 t2 = new CallCounterThread2(counter);
        Thread t = new Thread(t2);

        t1.start();
        t.start();

        try {
            t1.join();
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.count);
    }
}

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class CallCounterThread1 extends Thread{

    Counter ct;

    public CallCounterThread1 (Counter counter) {
        ct = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ct.increment();
        }
    }
}

class CallCounterThread2 implements Runnable {

    Counter ct;

    public CallCounterThread2 (Counter counter) {
        ct = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ct.increment();
        }
    }
}
