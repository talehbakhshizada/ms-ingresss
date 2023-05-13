package main.facade;

class PushNotificationService {
    public void sendPushNotification(String deviceId, String message) {
        System.out.println("Sending a push notification to " + deviceId + ": " + message);
    }
}