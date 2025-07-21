package MediatorPattern;

public class ChatUser {
    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator){
        this.name = name;
        this.chatMediator = chatMediator;
        this.chatMediator.addUser(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String msg){
        System.out.println(this.name + " is sending message ");
        chatMediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg, ChatUser sender){
        System.out.println(this.name + " received message: " + msg + " from " + sender.getName());
    }
}
