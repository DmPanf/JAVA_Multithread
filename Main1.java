public class Main1 {

    // Создание класса, который реализует интерфейс Runnable
    static class MyRunnable implements Runnable {
        private final String name;

        public MyRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for(int i = 0; i < 5; i++) {
                System.out.println("Thread " + name + " iteration: " + i);
                try {
                    // Приостанавливаем поток на 100 миллисекунд
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Создаем два потока, которые выполняются параллельно
        Thread thread1 = new Thread(new MyRunnable("A"));
        Thread thread2 = new Thread(new MyRunnable("B"));

        thread1.start();
        thread2.start();

        try {
            // Дожидаемся завершения выполнения каждого потока
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution");
    }
}
