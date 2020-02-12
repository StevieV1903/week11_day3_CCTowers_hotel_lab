import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest1;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;
    private ConferenceRoom conferenceRoom1;

    @Before
    public void before(){
        guest1 = new Guest("Bob Smith");
        bedroom1 = new Bedroom( 1, 2,"Double");
        bedroom2 = new Bedroom(2, 2, "Twin");
        bedroom3 = new Bedroom(3, 1, "Single");
        conferenceRoom1 = new ConferenceRoom(5, "Johnson Room");
        ArrayList<Bedroom> hotelBedrooms = new ArrayList<Bedroom>();
        hotelBedrooms.add(bedroom1);
        hotelBedrooms.add(bedroom2);
        hotelBedrooms.add(bedroom3);
        ArrayList<ConferenceRoom> hotelConferenceRooms = new ArrayList<ConferenceRoom>();
        hotelConferenceRooms.add(conferenceRoom1);
        hotel = new Hotel("Codeclan Towers", hotelBedrooms, hotelConferenceRooms);
    }
    @Test
    public void canGetHotelName(){
        assertEquals("Codeclan Towers", hotel.getHotelName());
    }

    @Test
    public void checkNumberOfHotelBedrooms(){
        assertEquals(3, hotel.numberOfBedrooms());
    }

    @Test
    public void checkNumberOfHotelConferenceRooms(){
        assertEquals(1, hotel.numberOfConferenceRooms());
    }

    @Test
    public void canCheckInGuestToBedroom(){
        bedroom1.addGuestToBedroomAsRoomGuest(guest1);
        assertEquals(1, bedroom1.bedroomGuestCount());
    }

    @Test
    public void canCheckInGuestToConferenceRoom(){
        conferenceRoom1.addGuestToConferenceRoomAsRoomGuest(guest1);
        assertEquals(1, conferenceRoom1.conferenceRoomGuestCount());
    }

    @Test
    public void canCheckOutGuestFromBedroom(){
        bedroom1.addGuestToBedroomAsRoomGuest(guest1);
        bedroom1.removeGuestFromBedroomAsRoomGuest(guest1);
        assertEquals(0, bedroom1.bedroomGuestCount());
    }

    @Test
    public void canCheckOutGuestFromConferenceRoom(){
        conferenceRoom1.addGuestToConferenceRoomAsRoomGuest(guest1);
        conferenceRoom1.removeGuestFromConferenceRoomAsRoomGuest(guest1);
        assertEquals(0, conferenceRoom1.conferenceRoomGuestCount());
    }

}
