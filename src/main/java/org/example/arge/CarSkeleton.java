package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //startEngine(), drive(), runEngine()
    public String startEngine(){
        return "the car's engine is starting";
    }

    public String drive(){
        return runEngine() + "the car is being driven";
    }

    protected String runEngine(){
        return "Engine is running";
    }
}
