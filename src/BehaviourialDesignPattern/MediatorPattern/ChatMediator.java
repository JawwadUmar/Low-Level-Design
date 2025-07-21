package MediatorPattern;

public interface ChatMediator {
    void sendMessage(String msg, ChatUser user);
    void addUser(ChatUser user);
}
