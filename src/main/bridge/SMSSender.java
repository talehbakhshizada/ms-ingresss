package main.bridge;

class SMSSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS message: " + message);
    }
}