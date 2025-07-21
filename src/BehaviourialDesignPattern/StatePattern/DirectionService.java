package StatePattern;

public class DirectionService {
    private TransportationState transportationState;

    public DirectionService(TransportationState transportationState){
        this.transportationState = transportationState;
    }

    public TransportationState getTransportationState() {
        return transportationState;
    }

    public void setTransportationState(TransportationState transportationState) {
        this.transportationState = transportationState;
    }

    //delegating the work to current state;s concrete class
    public int getETA(){
        return transportationState.calculateETA();
    }

    public String getDirection(){
        return transportationState.direction();
    }
}
