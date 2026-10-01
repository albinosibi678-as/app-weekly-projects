class TrafficJunction extends Thread {
    private String status;
    private int delay;

    TrafficJunction(String name, String status, int delay) {
        super(name);
        this.status = status;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + " - Traffic Status: " + status);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TrafficManagementSystem {
    public static void main(String[] args) {
        TrafficJunction junction1 = new TrafficJunction("Junction-1", "Heavy Traffic", 1000);
        TrafficJunction junction2 = new TrafficJunction("Junction-2", "Moderate Traffic", 1500);
        TrafficJunction junction3 = new TrafficJunction("Junction-3", "Light Traffic", 2000);

        junction1.start();
        junction2.start();
        junction3.start();
    }
}
