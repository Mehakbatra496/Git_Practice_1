
public class B5_Synchronize {  //Incorrect output in every case

    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();

        System.out.println(); // Print a new line

        MyThread my2 = new MyThread();
        my2.start();
    }
}

class MyThread extends Thread {
    static int n = 10;
    static int k = 0;

    synchronized public void run() {
        k = k + 1;
        System.out.println(Thread.currentThread().getName());
        fun(k);
    }

    synchronized void fun(int k) {
        try {
            // Thread.sleep(1000); // Uncomment if you want a delay
        } catch (Exception e) {
        }

        this.k = k;
        for (int i = 0; i < 3; i++) {
            System.out.println("Booked Seats " + k + "  remaining seats " + (n = n - k));
        }
    }
}
