public class DaemonDemo {
    public static void main(String[] args) {
        Thread daemon = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        daemon.setDaemon(true); // make it a daemon thread
        daemon.start();

        System.out.println("Main thread sleeping for 1 second...");
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Main thread ends - JVM will exit now!");
    }
}
