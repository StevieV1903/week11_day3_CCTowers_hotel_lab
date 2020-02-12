import com.sun.imageio.plugins.common.BogusColorSpace;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    private Guest guest1;

    @Before
    public void before(){
        guest1 = new Guest("Bob Smith");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("Bob Smith", guest1.getName());
    }
}
