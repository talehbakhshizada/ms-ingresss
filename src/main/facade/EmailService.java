package main.facade;

class EmailService {
    public void sendEmail(String email, String message) {
        System.out.println("Sending an email to " + email + ": " + message);
    }
}
