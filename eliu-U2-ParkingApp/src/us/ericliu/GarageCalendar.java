package us.ericliu;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GarageCalendar {
    static String checkInTime = "";
    static String checkOutTime = "";
    static int inTime;
    static int outTime;

    public static String generateIn(){
        inTime = (int) (Math.random() * 7) + 5;
        checkInTime = inTime + ":00 am";
        if (inTime == 12){
            checkInTime = inTime + ":00 pm";
        }
        return checkInTime;
    }
    public static String generateOut(){
        outTime = (int) (Math.random() * 1) + 10;
        checkOutTime = outTime + ":00 pm";
        return checkOutTime;
    }

    public static int calculateHours(){
        int hoursStayed = (12 - inTime) + (12 - outTime);
        return hoursStayed;
    }

    public static String getDate(){
        String pattern = "MM-dd-YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        return date;

    }
}
