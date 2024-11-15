package multithreading;


class ThreadClass extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread class number: Line: " + i);

            try {
                Thread.sleep(100);                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class threadClassExtend {
    public static void main(String[] args) {
        ThreadClass tc1 = new ThreadClass();
        tc1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: Line: " + i);
        }
    }
}
