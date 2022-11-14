package RoadAndTransport;

public class Bus extends Transport{
    private Integer busSeatsNum;
    public Bus(Float consumption, Float fuelTankCapacity, Integer busSeatsNum){
        super(consumption, fuelTankCapacity);
        this.busSeatsNum = busSeatsNum;
    }




}
