class worker extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("Thread 1 Running ...."+new java.util.Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test0 {
    public static void main(String[] args) {
        worker w1 = new worker();
        w1.start();
    }
}
