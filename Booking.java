/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pethotelbookingsystem;

public class Booking {
    private String bookingID;
    private String cubicleID;
    private String petID;
    private String date;
    private String time;
    private String bookedBy;

    public Booking(String bookingID, String cubicleID, String petID, String date, String time, String bookedBy) {
        this.bookingID = bookingID;
        this.cubicleID = cubicleID;
        this.petID = petID;
        this.date = date;
        this.time = time;
        this.bookedBy = bookedBy;
    }

    // Getters and setters
    public String getBookingID() { return bookingID; }
    public String getCubicleID() { return cubicleID; }
    public String getPetID() { return petID; }
    public String getDate() { return date; }
    public String getTime() { return time; }
    public String getBookedBy() { return bookedBy; }

    public void setCubicleID(String cubicleID) { this.cubicleID = cubicleID; }
    public void setPetID(String petID) { this.petID = petID; }
    public void setDate(String date) { this.date = date; }
    public void setTime(String time) { this.time = time; }
    public void setBookedBy(String bookedBy) { this.bookedBy = bookedBy; }
    
@Override
public String toString() {
return "Booking{" + "\nbookingID" + bookingID + "\ncubicleID" + cubicleID + "\npetID" + petID + "\ndate" + date + "\ntime" + time + "\nbookedBy" + bookedBy + '}';
}    
}


