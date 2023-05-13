package main.bridge;

class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email message: " + message);
    }
}