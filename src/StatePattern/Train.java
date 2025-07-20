package StatePattern;

public class Train implements TransportationState{

    @Override
    public int calculateETA() {
        System.out.println("Calculating ETA...Train");
        return 10;
    }

    @Override
    public String direction() {
        return "Go North-East";
    }
}



