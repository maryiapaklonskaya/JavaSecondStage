package RoadAndTransport;

public abstract class Transport {
    static Integer counter = 0;
    private Integer id;
    private Float consumption;
    private Float fuelTankCapacity;

    public Transport(Float consumption, Float fuelTankCapacity){
        id = counter++;
        this.consumption = consumption;
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public Integer getId() {
        return id;
    }

    public Float getConsumption() {
        return consumption;
    }

    public Float getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }

    public void setFuelTankCapacity(Float fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    @Override
    public String toString(){
        return "Transport { " +
                "id: " + id +
                "\nconsumption: " + consumption +
                "\nfuelTankCapacity: " + fuelTankCapacity +
                "\n}\n";
    }

    public void move(Road road){
        if(!road.getArrived()){
            float consumptionOf1Km = consumption/100;
            Float possibleDistance = fuelTankCapacity/consumptionOf1Km;
            if(possibleDistance >= road.getDistance()){
                System.out.println("we are moving on the road, it will become arrived\n");
                float takenFuel = road.getDistance()*consumptionOf1Km;
                fuelTankCapacity = fuelTankCapacity - takenFuel;
                road.setArrived(true);
            } else {
                System.out.println("we have not enough fuel :( \n");
            }
        } else {System.out.println("the road was already arrived\n");}
    }


}