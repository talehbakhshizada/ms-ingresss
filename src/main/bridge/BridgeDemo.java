package main.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        Message textMessage = new TextMessage(emailSender);
        textMessage.send("Hello, world!");

    }
}