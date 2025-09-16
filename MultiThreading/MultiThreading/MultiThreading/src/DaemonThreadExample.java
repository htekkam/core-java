public class DaemonThreadExample {
    public static void main(String[] args) throws InterruptedException {

        //int daemonCounter=0;
        Thread daemon = new Thread(
                ()-> {
                    int daemonCounter=0;
                    while (daemonCounter<999)
                    {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("Deamon thread running::"+daemonCounter++);
                    }
                }
        );

        daemon.setDaemon(true);
        daemon.start();
        Thread.sleep(1000);
        System.out.println("Main thread execution completed here");

    }
}
