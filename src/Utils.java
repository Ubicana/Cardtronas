public class Utils {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void wait(int time) {
        Thread waitThread = new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                // Handle interruption
            }
        });

        waitThread.start();

        try {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < time) {
                if (System.in.available() > 0) {
                    if (System.in.read() == '\n') {
                        System.out.print("[System] Skip.");
                        waitThread.interrupt();
                        break;
                    }
                }
            }
            waitThread.join();
        } catch (Exception e) {
            // Handle any other exceptions
        }
    }
}