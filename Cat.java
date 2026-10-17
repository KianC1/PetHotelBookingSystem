/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pethotelbookingsystem;

public class Cat extends Pet {
    private boolean foodLamb;
    private boolean foodFish;
    private boolean foodChicken;
    private boolean toys;

    public Cat(String petID, String ownerName, String telephone, String address, int petAge, 
               boolean foodLamb, boolean foodFish, boolean foodChicken, boolean toys) {
        super(petID, ownerName, telephone, address, petAge);
        this.foodLamb = foodLamb;
        this.foodFish = foodFish;
        this.foodChicken = foodChicken;
        this.toys = toys;
    }

    // Getters and setters
    public boolean isFoodLamb() { return foodLamb; }
    public boolean isFoodFish() { return foodFish; }
    public boolean isFoodChicken() { return foodChicken; }
    public boolean isToys() { return toys; }

    public void setFoodLamb(boolean foodLamb) { this.foodLamb = foodLamb; }
    public void setFoodFish(boolean foodFish) { this.foodFish = foodFish; }
    public void setFoodChicken(boolean foodChicken) { this.foodChicken = foodChicken; }
    public void setToys(boolean toys) { this.toys = toys; }
    
@Override
public String toString() {
return """
       Cat{
       petID""" 
       + petID 
       + "\nownerName" 
       + ownerName 
       + "\ntelephone" 
       + telephone 
       + "\nAddress" 
       + address 
       + "\nLamb" 
       + foodLamb 
       + "\nFish" 
       + foodFish 
       + "\nChicken" 
       + foodChicken 
       + "\nToys" 
       + toys 
       + '}';
}  
}


