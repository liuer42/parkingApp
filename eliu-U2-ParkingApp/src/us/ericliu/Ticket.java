package us.ericliu;

public class Ticket {
    private int id;
    private String timeIn;
    private String timeOut;
    private String date;

    public Ticket(String timeIn, String timeOut, String date, int id){
        this.timeIn = timeIn;
        this.timeOut = timeOut;
        this.date = date;
        this.id = id;
    }

    public String getTimeIn() {
        return timeIn;
    }
    public String getTimeOut() {
        return timeOut;
    }
    public String getDate() {
        return date;
    }
    public int getID() {
        return id;
    }
}
