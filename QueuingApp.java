class QueuingApp {
    public static void main(String[] args) {
        QueuingSystem queuingSystem = QueuingSystem.getInstance();

        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());

        queuingSystem.resetQueue(1);

        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());
        System.out.println("Serving customer with queue number: " + queuingSystem.getNextQueueNumber());
    }
}