/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pethotelbookingsystem;

public class Cubicle {
    private String cubicleID;
    private int floor;
    private double cost;
    private String size;
    private boolean occupied;

    public Cubicle(String cubicleID, String size, int floor, double cost, boolean occupied) {
        this.cubicleID = cubicleID;
        this.floor = floor;
        this.cost = cost;
        this.size = size;
        this.occupied = occupied;
    }

    // Getters and setters
    public String getCubicleID() { return cubicleID; }
    public int getFloor() { return floor; }
    public double getCost() { return cost; }
    public String getSize() { return size; }
    public boolean isOccupied() { return occupied; }

    public void setFloor(int floor) { this.floor = floor; }
    public void setCost(double cost) { this.cost = cost; }
    public void setSize(String size) { this.size = size; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
    
    @Override
public String toString() {
return "Cubicle{\n"
       +
       "\nCubicleID" 
       + cubicleID 
       + "\nFloor" 
       + floor 
       + "\nCost" 
       + cost
       + "\nSize" 
       + size 
       + "\nOccupied" 
       + occupied 
       + "\n}";
}  
}
