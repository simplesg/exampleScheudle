import java.util.ArrayList;
import java.util.List;

public class User {

    private String fullName;
    private final List<Event> eventList = new ArrayList<>();

    public User(String fullName, List<Event> eventList) {
        this.fullName = fullName;
        this.eventList.addAll(eventList);
    }

    public List<Event> getEventList() {
        return eventList;
    }

    public boolean isFree(Event event){
        for(Event event1 : eventList){
            if(event1.getDueDate().isAfter(event.getStartDate()) || event1.getDueDate().isEqual(event.getStartDate()))
                return false;
        }
        return true;
    }

    public void addEventToList(Event event){
       this.eventList.add(event);
    }
}
