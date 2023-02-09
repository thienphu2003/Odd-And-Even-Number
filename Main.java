public class Main {
    public static void main(String[] args) {
        OddThread thread1 = new OddThread();
        EvenThread thread2 = new EvenThread();
        thread1.start();
        try {
            thread1.join();
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        thread2.start();
    }
}
