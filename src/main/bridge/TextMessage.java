package main.bridge;

class TextMessage extends Message {
    public TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        messageSender.sendMessage("Text message: " + message);
    }
}
