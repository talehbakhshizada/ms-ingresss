package main.facade;

class SMSService {
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending an SMS to " + phoneNumber + ": " + message);
    }
}