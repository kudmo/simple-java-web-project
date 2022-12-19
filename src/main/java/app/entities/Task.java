package app.entities;

public class Task {
    private String event;
    private String time;
    public Task() {

    }
    public Task(String event, String time){
        this.event = event;
        this.time = time;
    }
    public String getEvent() {
        return event;
    }
    public void setEvent(String event) {
        this.event = event;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {return time + ": " + event;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task user = (Task) obj;
        if ((event != null) ? (!event.equals(user.event)) : (user.event != null)) return false;
        return (time != null) ? time.equals(user.time) : (user.time == null);
    }

    @Override
    public int hashCode() {
        int result = (event != null) ? event.hashCode() : 0;
        result = 31 * result + ((time != null) ? time.hashCode() : 0);
        return result;
    }
}
