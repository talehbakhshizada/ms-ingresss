package main.facade;

class NotificationService {  //FACADE
    private EmailService emailService;
    private SMSService smsService;
    private PushNotificationService pushNotificationService;

    public NotificationService() {
        emailService = new EmailService();
        smsService = new SMSService();
        pushNotificationService = new PushNotificationService();
    }

    public void sendNotification(String message, String email, String phoneNumber, String deviceId) {
        emailService.sendEmail(email, message);
        smsService.sendSMS(phoneNumber, message);
        pushNotificationService.sendPushNotification(deviceId, message);
    }
}