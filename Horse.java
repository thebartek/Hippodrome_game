package me.BartlomiejMarczuk;

public class Horse {

    private String name;
    private double speed;
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    void move() {
        distance += speed*Math.random();
    }

    void print() {
        int d = (int) distance;
        for(int i=0; i<d; i++){
            System.out.print(".");
        }
        System.out.println(name);
    }
}
