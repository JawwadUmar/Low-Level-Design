package StatePattern;

public class Walking implements TransportationState{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA...Walking");
        return 10;
    }

    @Override
    public String direction() {
        return "Go North";
    }
}
