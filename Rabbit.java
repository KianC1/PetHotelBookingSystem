/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pethotelbookingsystem;

public class Rabbit extends Pet {
    private boolean carrots;
    private boolean lettuce;

    public Rabbit(String petID, String ownerName, String telephone, String address, int petAge, 
                 boolean carrots, boolean lettuce) {
        super(petID, ownerName, telephone, address, petAge);
        this.carrots = carrots;
        this.lettuce = lettuce;
    }

    // Getters and setters
    public boolean isCarrots() { return carrots; }
    public boolean isLettuce() { return lettuce; }

    public void setCarrots(boolean carrots) { this.carrots = carrots; }
    public void setLettuce(boolean lettuce) { this.lettuce = lettuce; }
    
@Override
public String toString() {
return """
       Rabbit{
       petID""" 
       + petID 
       + "\nownerName" 
       + ownerName 
       + "\ntelephone" 
       + telephone 
       + "\nAddress" 
       + address 
       + "\nPetAge" 
       + petAge 
       + "\nCarrots" 
       + carrots 
       + "\nLettuce" 
       + lettuce 
       + '}';
}  
}
