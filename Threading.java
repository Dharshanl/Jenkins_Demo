
public class Threading extends Thread {

    @Override
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        Threading t1 = new Threading();
        t1.start();
    }
}
