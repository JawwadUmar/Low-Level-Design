package StructuralDesignPattern.AdapterPattern;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String from, String subject, String to) {
        System.out.println("Sending email to "+ to + " from "+ from);
        System.out.println("Subject: " + subject);
    }
}
