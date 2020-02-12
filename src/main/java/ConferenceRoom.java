import java.util.ArrayList;

public class ConferenceRoom {

    private int conferenceRoomCapacity;
    private String conferenceRoomName;
            ArrayList<Guest> conferenceGuests;

    public ConferenceRoom(int conferenceRoomCapacity, String conferenceRoomName){
        this.conferenceRoomCapacity = conferenceRoomCapacity;
        this.conferenceRoomName = conferenceRoomName;
        this.conferenceGuests = new ArrayList<Guest>();

    }

    public int getConferenceRoomCapacity() {
        return this.conferenceRoomCapacity;
    }

    public String getConferenceRoomName() {
        return this.conferenceRoomName;
    }

    public int conferenceRoomGuestCount() {
        return this.conferenceGuests.size();
    }
    public void addGuestToConferenceRoomAsRoomGuest(Guest guest) {
        this.conferenceGuests.add(guest);
    }

    public void removeGuestFromConferenceRoomAsRoomGuest(Guest guest) {
        this.conferenceGuests.clear();
    }
}




