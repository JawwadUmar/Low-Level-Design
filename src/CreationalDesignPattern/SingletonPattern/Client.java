package CreationalDesignPattern.SingletonPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseConnector databaseConnector1 = DatabaseConnector.createInstance();
        DatabaseConnector databaseConnector2 = DatabaseConnector.createInstance();

        //You will get true because both are the same objects now
        System.out.println(databaseConnector1.equals(databaseConnector2));

        //If you set apikey of one object, the apikey of the other one is automatically going to be set the same
        databaseConnector1.setApiKey("fandj");
        System.out.println(databaseConnector2.getApiKey());
    }
}
