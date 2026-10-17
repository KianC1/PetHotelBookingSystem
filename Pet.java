/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pethotelbookingsystem;

public class Pet {
    public String petID;
    public String ownerName;
    public String telephone;
    public String address;
    public int petAge;

    public Pet(String petID, String ownerName, String telephone, String address, int petAge) {
        this.petID = petID;
        this.ownerName = ownerName;
        this.telephone = telephone;
        this.address = address;
        this.petAge = petAge;
    }

    // Getters and setters
    public String getPetID() { return petID; }
    public String getOwnerName() { return ownerName; }
    public String getTelephone() { return telephone; }
    public String getAddress() { return address; }
    public int getPetAge() { return petAge; }

    public void setOwnerName(String ownerName) { 
        if (ownerName.isEmpty()){
            System.out.println("Owner Name cannot be Empty");
        }else{
            this.ownerName = ownerName;
        }//end if
    
}
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public void setAddress(String address) { this.address = address; }
    public void setPetAge(int petAge) { this.petAge = petAge; }
    
@Override
public String toString() {
return """
       Pet{
       petID""" 
       + petID 
       + "\nownerName" 
       + ownerName 
       + "\ntelephone" 
       + telephone 
       + "\naddress" 
       + address 
       + "\npetAge" 
       + petAge 
       + '}';
}  
}
