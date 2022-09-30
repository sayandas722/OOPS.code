class MultiThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
        System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
        }
    }
}

public class JavaApplication4 {

    public static void main(String[] args) {
        Thread object = new Thread(new MultiThread());
        object.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread id: " + Thread.currentThread().getId());
        }
    }
}
