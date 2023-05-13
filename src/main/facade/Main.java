package main.facade;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, World!", "test@test.com", "1234567", "abc123");
    }
}