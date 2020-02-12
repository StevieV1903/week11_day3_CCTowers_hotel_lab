import java.util.ArrayList;

public class Hotel {

    private String hotelName;
            ArrayList<Bedroom> hotelBedrooms;
            ArrayList<ConferenceRoom> hotelConferenceRooms;

    public Hotel(String hotelName, ArrayList<Bedroom> hotelBedrooms, ArrayList<ConferenceRoom> hotelConferenceRooms) {
        ;
        this.hotelName = hotelName;
        this.hotelBedrooms = hotelBedrooms;
        this.hotelConferenceRooms = hotelConferenceRooms;
    }


    public String getHotelName() {
        return this.hotelName;
    }

    public int numberOfBedrooms() {
        return this.hotelBedrooms.size();
    }

    public int numberOfConferenceRooms() {
        return this.hotelConferenceRooms.size();
    }

    public void checkInGuest(Bedroom bedroom, Guest guest) {
        bedroom.addGuestToBedroomAsRoomGuest(guest);
    }

//    public void createNewRoomBooking(int numberOfNights, Bedroom bedroom, Guest guest) { {
//            this.numberOfNights = numberOfNights;
//            this.bedroom = bedroom;
//            this.guest = guest;
//        }
//        Booking obj=new Booking(numberOfNights, bedroom, guest);
    }
}
