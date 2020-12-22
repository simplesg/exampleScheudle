import java.time.LocalDateTime;

public class Event {
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private String titleOfEvent;

    public Event(LocalDateTime startDate, LocalDateTime dueDate, String titleOfEvent) {
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.titleOfEvent = titleOfEvent;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getTitleOfEvent() {
        return titleOfEvent;
    }

    public void setTitleOfEvent(String titleOfEvent) {
        this.titleOfEvent = titleOfEvent;
    }

    @Override
    public String toString() {
        return "Event{" +
                "startDate=" + startDate +
                ", dueDate=" + dueDate +
                ", titleOfEvent='" + titleOfEvent + '\'' +
                '}';
    }
}
