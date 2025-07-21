package MediatorPattern;

public class Client {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        ChatUser chatUser1 = new ChatUser("Levi", chatRoom);
        ChatUser chatUser2 = new ChatUser("Eren", chatRoom);
        ChatUser chatUser3 = new ChatUser("Armin", chatRoom);
        ChatUser chatUser4 = new ChatUser("Mi-ka-sa", chatRoom);

        chatUser2.sendMessage("tatakae.. tatakae"); //everyone receives the message :)
        chatUser1.sendMessage("you have punchable face eren"); //everyone receives the message :)



    }
}
