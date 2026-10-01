class TransactionProcessingTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Processing Transaction - Execution Count: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class BalanceUpdatingTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Updating Balance - Execution Count: " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SMSNotificationTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Sending SMS Notification - Execution Count: " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        Thread transactionThread = new Thread(new TransactionProcessingTask());
        Thread balanceThread = new Thread(new BalanceUpdatingTask());
        Thread smsThread = new Thread(new SMSNotificationTask());

        transactionThread.setName("Transaction-Thread");
        balanceThread.setName("Balance-Thread");
        smsThread.setName("SMS-Thread");

        transactionThread.start();
        balanceThread.start();
        smsThread.start();
    }
}
