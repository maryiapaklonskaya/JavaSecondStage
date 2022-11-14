package RoadAndTransport;

public class Road {
    private String from;
    private String to;
    private Integer distance;
    private Boolean arrived = false;

    public Road(String from, String to, Integer distance){
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Road(String from){
        this.from = from;
        to = "Not set";
        distance = 0;
    }

    public Road(Integer distance){
        from = "Not set";
        to = "Not set";
        this.distance = distance;
    }

    public Road(){
        from = "Not set";
        to = "Not set";
        distance = 0;
    }

    public String getTo(){
        return to;
    }

    public String getFrom(){
        return from;
    }

    public Integer getDistance(){
        return distance;
    }

    public Boolean getArrived(){
        return arrived;
    }

    public void setTo(String to){
        this.to = to;
    }

    public void setFrom(String from){
        this.from = from;
    }

    public void setDistance(Integer distance){
        this.distance = distance;
    }

    public void setArrived(Boolean arrived){
        this.arrived = arrived;
    }

    @Override
    public String toString(){
        return "Road { " +
                "from: " + from +
                " to: " + to +
                "\ndistance: " + distance +
                "\narrived: " + arrived + "\n}\n";
    }


}
