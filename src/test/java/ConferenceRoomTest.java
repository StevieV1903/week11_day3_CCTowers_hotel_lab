import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom(5, "Johnson Room");
        guest1 = new Guest("Bob Smith");
    }

    @Test
    public void canGetConferenceRoomCapacity(){
        assertEquals(5, conferenceRoom1.getConferenceRoomCapacity());
    }

    @Test
    public void canGetConferenceRoomName(){
        assertEquals("Johnson Room", conferenceRoom1.getConferenceRoomName());
    }
    @Test
    public void checkNumberOfGuestsInConferenceRoom() {
        assertEquals(0, conferenceRoom1.conferenceRoomGuestCount());
    }

    @Test
    public void canAddGuestToBedroom(){
        this.conferenceRoom1.addGuestToConferenceRoomAsRoomGuest(guest1);
        assertEquals(1, conferenceRoom1.conferenceRoomGuestCount());
    }

}
