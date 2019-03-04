package us.ericliu;
import java.util.Scanner;

import static us.ericliu.Ledger.*;

public class CheckIn extends Machine implements Usable{

    @Override
    public String print() {
        return null;
    }

    @Override
    public void optionOne(){
        addTicket();
    }

    @Override
    public void optionTwo() {
        viewTickets(tickets);
    }

}
