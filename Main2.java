import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static class SystemInfoRunnable implements Runnable {
        private final String command;

        public SystemInfoRunnable(String command) {
            this.command = command;
        }

        @Override
        public void run() {
            try {
                Process process = Runtime.getRuntime().exec(command);
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SystemInfoRunnable("uname -a"));

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread execution finished");
    }
}
