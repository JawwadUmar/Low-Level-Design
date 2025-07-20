package StatePattern;

public class Client {
    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Car());
        System.out.println(directionService.getDirection());
        System.out.println(directionService.getETA());
    }
}
