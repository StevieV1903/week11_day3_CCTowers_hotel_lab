import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest1;

    @Before
    public void before(){
        bedroom1 = new Bedroom( 1, 2,"Double");
        guest1 = new Guest("Bob Smith");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, bedroom1.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, bedroom1.getBedroomCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("Double", bedroom1.getRoomType());
    }

    @Test
    public void checkNumberOfGuestsInBedroom() {
        assertEquals(0, bedroom1.bedroomGuestCount());
    }

    @Test
    public void canAddGuestToBedroom(){
        this.bedroom1.addGuestToBedroomAsRoomGuest(guest1);
        assertEquals(1, bedroom1.bedroomGuestCount());
    }
}
