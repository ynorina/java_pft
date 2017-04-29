package ru.stqa.pft.sandbox;

/**
 * Created by jnorina on 29/04/2017.
 */
public class Point {
    public double x;
    public double y;

    public Point(double xx, double yy){
        this.x=xx;
        this.y=yy;
    }



    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x-this.x,2)+ Math.pow(point.y-this.y,2));
  }
}
