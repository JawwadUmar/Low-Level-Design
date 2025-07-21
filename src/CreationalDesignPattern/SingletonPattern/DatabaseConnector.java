package CreationalDesignPattern.SingletonPattern;

public class DatabaseConnector {

    private static DatabaseConnector instance;
    private String apiKey;
    private String apiUrl;

    private DatabaseConnector(){
        this.apiKey = "jvfjvkvkfnvknkfvkmodkcoekejg";
        this.apiUrl = "https://kfmvfkvm/";
    }

    public static DatabaseConnector createInstance(){
        if(instance == null){
            instance =  new DatabaseConnector();
        }

        return instance;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
