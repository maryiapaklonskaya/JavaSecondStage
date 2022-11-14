package RoadAndTransport;

public class Management {
    static Integer roadsNum;
    static Integer transportNum;
    static Integer busesNum;
    public static Road[] allRoads;
    public static Transport[] allTransport;
    public static Bus[] allBuses;

    public static void main(String[] args){
        Road road1 = new Road("Vilnius", "Tallin", 350);
        Bus bus1 = new Bus(35.35f, 100000f, 55);
        Bus bus2 = new Bus(35.35f, 100f, 55);

        Management managementSystem = new Management();

        managementSystem.initSystem(1, 1, 2);
        managementSystem.setRoad(road1, 0);
        managementSystem.getRoads();
        managementSystem.setBus(bus1, 0);
        managementSystem.setBus(bus2, 1);
        getBuses();
        allBuses[1].move(allRoads[0]);
        allBuses[0].move(allRoads[0]);
        allBuses[0].move(allRoads[0]);
        getRoads();
        getBuses();
    }

    public static void initSystem(Integer roadsNum, Integer transportNum, Integer busesNum){
        allRoads = new Road[roadsNum];
        allTransport = new Transport[transportNum];
        allBuses = new Bus[busesNum];
    }

    public static void setRoad(Road road, Integer index){
        allRoads[index] = road;
    }

    public static void setBus(Bus bus, Integer index){
        allBuses[index] = bus;
    }

    public static void getBuses()
    {
        for(Bus bus : allBuses){
            System.out.println(bus.toString());
        }
    }

    public static void getRoads()
    {
        for(Road road : allRoads){
            System.out.println(road.toString());
        }
    }

}

/*
 Road ===> from, to, distance(50km), arrived | methods ==> getters and setters, toString | create constructor to set empty values for all fields
 Transport ===> id, consumption = 10/100km, fuelTank(1l) | methods ==> getters and setters, toString, move(road)

 TransportManagement ===> static Array of transports, roads | methods:

            getTransports, getRoads, setRoad(roadObject, index), setTransport(transportObject, index)

 */
