package StructuralDesignPattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {
//        NotificationService emailService = new EmailNotificationService();
        NotificationService emailService = new SendGridAdapter(new SendGridService());
        emailService.send("Ereh", "you ar femliy", "mi-ka-Sa");


    }
}
