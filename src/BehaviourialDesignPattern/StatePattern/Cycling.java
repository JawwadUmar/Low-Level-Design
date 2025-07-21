package StatePattern;

public class Cycling implements TransportationState{
    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA...Cycling");
        return 8;
    }

    @Override
    public String direction() {
        return "Go North-West";
    }
}