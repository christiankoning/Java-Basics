import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
       ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            executor.execute(new ExecutorExampleRunnable(i));
        }
       executor.shutdown();
    }
}

class ExecutorExampleRunnable implements Runnable {

    int id;

    public ExecutorExampleRunnable(int taskId) {
        id = taskId;
    }

    @Override
    public void run() {
        try {
            System.out.println("Task " + id + " is starting");
            Thread.sleep(1000);
            System.out.println("Task " + id + " is ending");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
