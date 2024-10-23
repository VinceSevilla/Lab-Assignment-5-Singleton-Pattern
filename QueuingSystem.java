public class QueuingSystem {
    private static QueuingSystem instance;
    private int currentQueueNumber;

    private QueuingSystem() {
        currentQueueNumber = 143;
    }

    public static synchronized QueuingSystem getInstance() {
        if (instance == null) {
            instance = new QueuingSystem();
        }
        return instance;
    }

    public synchronized int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public synchronized int getNextQueueNumber() {
        return ++currentQueueNumber;
    }

    public synchronized void resetQueue(int newNumber) {
        if (newNumber >= 0) {
            currentQueueNumber = newNumber;
            System.out.println("Queue number reset to: " + newNumber);
        } else {
            System.out.println("Invalid queue number.");
        }
    }
}