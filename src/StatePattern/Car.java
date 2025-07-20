package StatePattern;

public class Car implements TransportationState{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA...Car");
        return 4;
    }

    @Override
    public String direction() {
        return "Go North-West";
    }
}
