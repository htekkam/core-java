//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Runnable r1 = ()->{
            for (int i =0;i<50;i++)
                System.out.println("Thread1::"+i);
        };
        Runnable r2 = ()->{
            for (int i =0;i<50;i++)
                System.out.println("Thread2::"+i);
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(()-> System.out.println("This is thread 3"));
        ExtendedThread t4 = new ExtendedThread();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
class ExtendedThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("This thread is created by extending thread class");
    }
}