import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {

    Booking booking1;
    Bedroom bedroom1;
    Guest guest1;

    @Before
    public void before(){
        booking1 = new Booking(3, bedroom1, guest1);
    }

    @Test
    public void canGetBookingNumberOfNights(){
        assertEquals(3, booking1.getBookingNumberOfNights());
    }

    @Test
    public void canGetWhichRoomBooked(){
        assertEquals(bedroom1, booking1.getWhichRoomBooked());
    }

    @Test
    public void canGetBookingGuest(){
        assertEquals(guest1,booking1.getWhichGuestBooked());
    }
}
