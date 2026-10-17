/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pethotelbookingsystem;

public class Dog extends Pet {
    private boolean requiresWalking;
    private String feedType;
    private boolean grooming;
    private String breed;

    public Dog(String petID, String ownerName, String telephone, String address, int petAge, 
               boolean requiresWalking, String feedType, boolean grooming, String breed) {
        super(petID, ownerName, telephone, address, petAge);
        this.requiresWalking = requiresWalking;
        this.feedType = feedType;
        this.grooming = grooming;
        this.breed = breed;
    }

    // Getters and setters
    public boolean isRequiresWalking() { return requiresWalking; }
    public String getFeedType() { return feedType; }
    public boolean isGrooming() { return grooming; }
    public String getBreed() { return breed; }

    public void setRequiresWalking(boolean requiresWalking) { this.requiresWalking = requiresWalking; }
    public void setFeedType(String feedType) { this.feedType = feedType; }
    public void setGrooming(boolean grooming) { this.grooming = grooming; }
    public void setBreed(String breed) { this.breed = breed; }
    
@Override
public String toString() {
return "Dog{\n"
       +
       "\npetID" 
       + petID 
       + "\nownerName" 
       + ownerName 
       + "\ntelephone" 
       + telephone 
       + "\nAddress" 
       + address 
       + "\nPetAge" 
       + petAge 
       + "\nRequiresWalking" 
       + requiresWalking 
       + "\nFeedType" 
       + feedType 
       + "\nGrooming" 
       + grooming 
       + "\nBreed" 
       + breed 
       + "\n}";
}  
}
