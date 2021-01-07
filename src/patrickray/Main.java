package patrickray;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Seats[] seats = new Seats[10];
        for (int i = 0 ; i<10; i++)
            seats[i] = new Seats();

        System.out.println("------------------------------");
        System.out.println("   BUS RESERVATION SYSTEM");
        System.out.println("------------------------------");
        System.out.println("   1.View Available Seats");
        System.out.println("   2.Book a Seat");
        System.out.println("   3.Remove a customer from seat");
        System.out.println("   4.Save to a file");
        System.out.println("   5.Load from a file");
        System.out.print  ("   Choice:");

        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                viewSeats(seats);
                break;
            case 2:
                bookSeat(seats);
                break;
                default:
                System.out.println("Invalid Selection ");

        }
    }

    public static void viewSeats(Seats[] seat)
    {
        int i = 1;
        for (Seats s : seat)
        {
            System.out.println("seat "+(i++)+" : " + s.OccupiedOrEmpty());
        }
    }
    public static void bookSeat(Seats[] seat)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seat number:");
        int seatNum = scanner.nextInt();
        if (seat[seatNum-1].isOccupied() == true )
        {
            System.out.println("seat already occupied");
        }
    }
}
