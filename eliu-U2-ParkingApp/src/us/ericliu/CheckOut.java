package us.ericliu;
import static us.ericliu.GarageCalendar.*;
import static us.ericliu.Ledger.*;

public class CheckOut extends Machine implements Usable {

    @Override
    public String print() {
        return null;
    }

    @Override
    public void optionOne() {
        generateOut();

        System.out.println("Eric's Parking Garage");
        System.out.println("=====================");
        System.out.println("\nReceipt for a vehicle id " + getId());
        System.out.println("\n" + calculateCharge(calculateHours()) + " hours parked " + checkInTime + " - " + checkOutTime);
        System.out.println();
        closeTicket();
        Save();
    }
    @Override
    public void optionTwo() {

    }

    public static int calculateCharge(int hours){

        final int minCharge = 5;
        final int maxCharge = 15;
        final int minHours = 3;
        final int maxHours = 24;
        final int surcharge = 1;
        int fee;

        fee = minCharge;
        if(hours <= minHours){
            fee = minCharge;
        } else if (hours > minHours && hours < maxHours){
            fee = (int)(surcharge*(Math.ceil(hours) - minHours) + minCharge);
        } else if (hours == maxHours){
            fee = maxCharge;
        }
        if (fee > maxCharge){
            fee = maxCharge;
        }
        return fee;
    }
}
