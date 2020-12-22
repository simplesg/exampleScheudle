import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Event> eventList =
                Arrays.asList(
                        new Event(LocalDateTime.of(2020, 12, 22, 13, 30), LocalDateTime.of(2020, 12, 22, 15, 30), "event"));
        User user = new User("sorin", eventList);

        Event newEvent = new Event(LocalDateTime.of(2020, 12, 22, 14, 30), LocalDateTime.of(2020, 12, 22, 17, 30), "event");
        Event newEvent2 = new Event(LocalDateTime.of(2020, 12, 22, 16, 30), LocalDateTime.of(2020, 12, 22, 17, 30), "event");
        List<Event> newEventList = Arrays.asList(newEvent2, newEvent);

        System.out.println(user.isFree(newEvent));

        newEventList.forEach(event -> {
                    if (user.isFree(event)) {
                        user.addEventToList(event);
                    }
                }
        );

        user.getEventList().forEach(System.out :: println);
    }
}
