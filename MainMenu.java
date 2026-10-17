/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pethotelbookingsystem;

import java.util.ArrayList;

public class MainMenu {
    static ArrayList<Cubicle> cubicles = new ArrayList<>();
    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();
    private int cubicleCounter;
    private int petCounter;
    private int bookingCounter;
    
    
    public MainMenu() {
        cubicles = new ArrayList<>();
        pets = new ArrayList<>();
        bookings = new ArrayList<>();
        
        cubicleCounter = 1001;
        petCounter = 2001;
        bookingCounter = 3001;
    }
    
    public ArrayList<Pet> getAllPets() {
        return pets;
    }

    // CubicleID method
    public String addCubicle(Cubicle cubicle) {
        String cubicleID = "C" + cubicleCounter++;
        cubicles.add(cubicle);
        return cubicleID;
    }

    public Cubicle getCubicle(String cubicleID) {
        for (Cubicle cubicle : cubicles) {
            if (cubicle.getCubicleID().equals(cubicleID)) {
                return cubicle;
            }
        }
        return null;
    }

    public ArrayList<Cubicle> getAllCubicles() {
        return cubicles;
    }

    public ArrayList<Cubicle> getAvailableCubicles() {
        ArrayList<Cubicle> available = new ArrayList<>();
        for (Cubicle cubicle : cubicles) {
            if (!cubicle.isOccupied()) {
                available.add(cubicle);
            }
        }
        return available;
    }

    // Pet methods
    public String addPet(Pet pet) {
        String petID = "P" + petCounter++;
        pets.add(pet);
        return petID;
    }

    public Pet getPet(String petID) {
        for (Pet pet : pets) {
            if (pet.getPetID().equals(petID)) {
                return pet;
            }
        }
        return null;
    }

    public ArrayList<Pet> showAllPets() {
        return pets;
    }

    // Booking methods
    public String addBooking(String cubicleID, String petID, String date, String time, String bookedBy) {
        String bookingID = "B" + bookingCounter++;;
        Booking booking = new Booking(bookingID, cubicleID, petID, date, time, bookedBy);
        bookings.add(booking);
        
        // Mark cubicle as occupied
        Cubicle cubicle = getCubicle(cubicleID);
        if (cubicle != null) {
            cubicle.setOccupied(true);
        }
        
        return bookingID;
    }

    public Booking getBooking(String bookingID) {
        for (Booking booking : bookings) {
            if (booking.getBookingID().equals(bookingID)) {
                return booking;
            }
        }
        return null;
    }

    public boolean deleteBooking(String bookingID) {
        Booking bookingToRemove = null;
        for (Booking booking : bookings) {
            if (booking.getBookingID().equals(bookingID)) {
                bookingToRemove = booking;
                break;
            }
        }
        
        if (bookingToRemove != null) {
            // Mark cubicle as available
            Cubicle cubicle = getCubicle(bookingToRemove.getCubicleID());
            if (cubicle != null) {
                cubicle.setOccupied(false);
            }
            
            bookings.remove(bookingToRemove);
            return true;
        }
        return false;
    }

    public ArrayList<Booking> getAllBookings() {
        return bookings;
    }

    public boolean isPetBooked(String petID) {
        for (Booking booking : bookings) {
            if (booking.getPetID().equals(petID)) {
                return true;
            }
        }
        return false;
    }
}
