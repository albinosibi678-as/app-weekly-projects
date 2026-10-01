class RemainingTimeTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Displaying Remaining Time: " + (30 - i * 5) + " minutes left");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class AutoSaveTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Auto-saving student answers");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class NetworkCheckTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Checking network connection");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        Thread timeThread = new Thread(new RemainingTimeTask());
        Thread saveThread = new Thread(new AutoSaveTask());
        Thread networkThread = new Thread(new NetworkCheckTask());

        timeThread.setName("Timer-Thread");
        saveThread.setName("AutoSave-Thread");
        networkThread.setName("Network-Thread");

        timeThread.start();
        saveThread.start();
        networkThread.start();
    }
}
