package us.ericliu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import static us.ericliu.GarageCalendar.*;

public class Ledger {

    static ArrayList<Ticket> tickets = new ArrayList<>();
    static int id = 1;
    static File file = new File("tickets.csv");

    public static void addTicket(){
        generateIn();
        //tickets.add(new Ticket(generateIn(), getDate(), id));
        id++;
    }
    public static void closeTicket(){
        tickets.add(new Ticket(generateIn(),generateOut(), getDate(), id));
    }
    public static int getId(){
        return id;
    }
    public static void viewTickets(ArrayList<Ticket> list){
        for (Ticket t: tickets){
            System.out.println(t);
        }
    }
    public static void Save(){
        try (PrintWriter pw = new PrintWriter(file)) {
            for (Ticket t : tickets) {
                pw.println("in:"+t.getTimeIn()+",out:"+t.getTimeOut()+','+t.getDate()+','+t.getID());
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found error");
        }

    }
}
