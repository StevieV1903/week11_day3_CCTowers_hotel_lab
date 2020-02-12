import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int bedroomCapacity;
    private ArrayList<Guest> roomGuests;
    private String bedroomType;

    public Bedroom(int roomNumber, int bedroomCapacity, String bedroomType){
        this.roomNumber = roomNumber;
        this.bedroomCapacity = bedroomCapacity;
        this.bedroomType = bedroomType;
        this.roomGuests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getBedroomCapacity() {
        return this.bedroomCapacity;
    }

    public String getRoomType() {
        return this.bedroomType;
    }

    public int bedroomGuestCount() {
        return this.roomGuests.size();
    }

    public void addGuestToBedroomAsRoomGuest(Guest guest) {
        this.roomGuests.add(guest);
    }

    public void removeGuestFromBedroomAsRoomGuest(Guest guest) {
        this.roomGuests.clear();
    }
}
