public class Booking {

    private int numberOfNights;
    private Bedroom bedroom;
    private Guest guest;

    public Booking(int numberOfNights, Bedroom bedroom, Guest guest) {
        this.numberOfNights = numberOfNights;
        this.bedroom = bedroom;
        this.guest = guest;
    }


    public int getBookingNumberOfNights() {
        return this.numberOfNights;
    }

    public Bedroom getWhichRoomBooked() {
        return this.bedroom;
    }

    public Guest getWhichGuestBooked() {
        return this.guest;
    }
}
