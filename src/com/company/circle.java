package com.company;

public class circle {

private double radius;
private String color;

public circle(){


}
public circle(double r){
    radius = r;
    color = "red";
}

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getColor(){
    return radius*radius*Math.PI;
    }

}




