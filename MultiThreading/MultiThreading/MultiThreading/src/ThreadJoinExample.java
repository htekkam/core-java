public class ThreadJoinExample {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(
                ()-> {
                    for (int i=0;i<10;i++)
                        System.out.println("Thread-1 executing::"+i);
                }
        );
        Thread t2 = new Thread(
                ()-> {
                    for (int i=0;i<10;i++)
                        System.out.println("Thread-2 executing::"+i);
                }
        );
        t1.start();
        //t1.join();
        t2.start();
        System.out.println("Completed thread executions");
    }
}

