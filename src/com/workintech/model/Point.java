package com.workintech.model;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(int A,int B){
        int distanceX=x-A;
        int distanceY=y-B;
        return Math.sqrt(Math.pow(distanceX,2)+Math.pow(distanceY,2));
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(Point p){
        int distanceX=x-p.getX();
        int distanceY=y-p.getY();
        return Math.sqrt(Math.pow(distanceX,2)+Math.pow(distanceY,2));
    }

}
