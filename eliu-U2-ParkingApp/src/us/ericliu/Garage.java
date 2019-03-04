package us.ericliu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Garage  {
    Scanner kb = new Scanner(System.in);

    Machine checkOut = new CheckOut();

    public void Open() {
        boolean running = true;
        while(running) {
            System.out.println("Eric's Parking Garage");
            System.out.println("=====================");
            System.out.println("\n1 - Check in");
            System.out.println("\n3 - Close Garage");
            System.out.println("\n=>_");
            String input = kb.nextLine();

            if (Integer.parseInt(input) == 1) {
                try {
                    Machine checkIn = new CheckIn();
                    checkIn.optionOne();
                    Close();
                } catch (Exception e) {
                    System.out.println("File not found");
                }
            } else if (Integer.parseInt(input) == 3) {
                try {
                    Machine checkIn = new CheckIn();
                    checkIn.optionTwo();

                } catch (Exception e) {
                    System.out.println("File not found");
                }
            }
        }
    }

    public void Close() {
        System.out.println("Eric's Parking Garage");
        System.out.println("=====================");

        System.out.println("\n1 - Check out");
        System.out.println("\n2 - Lost Ticket");
        System.out.println("\n=>_");
        String input = kb.nextLine();

        if (Integer.parseInt(input) == 1) {
            try {
                Machine checkOut = new CheckOut();
                checkOut.optionOne();
                Open();
            }catch(Exception e){
                System.out.println("File not found");
            }
        } else if (Integer.parseInt(input) == 2) {
            try {
                Machine checkOut = new CheckOut();
                checkOut.optionTwo();

            }catch(Exception e){
                System.out.println("File not found");
            }
        }
    }
}


