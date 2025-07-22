package StructuralDesignPattern.AdapterPattern;

public class SendGridService {

    public void sendEmail(String to, String from, String content){
        System.out.println("Sending email to "+ to + " from " + from);
        System.out.println("Subject: "+ content);
        System.out.println("This message is sent via SendGrid");
    }
}
