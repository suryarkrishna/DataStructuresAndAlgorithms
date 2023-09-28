
import java.util.Scanner;

class BusReservation {
    private boolean[] seats;

    public BusReservation(int numSeats) {
        seats = new boolean[numSeats];
        for (int i = 0; i < numSeats; i++) {
            seats[i] = false; // Initialize all seats as available
        }
    }

    public void reserveSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seats.length) {
            if (!seats[seatNumber - 1]) {
                seats[seatNumber - 1] = true;
                System.out.println("\nSeat " + seatNumber + " reserved successfully.");
            } else {
                System.out.println("\nSeat " + seatNumber + " is already reserved.");
            }
        } else {
            System.out.println("Invalid seat number.");
        }
    }

    public void displaySeats() {
        System.out.println("\nSeat availability:");
        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat " + (i + 1) + ": " + (seats[i] ? "Reserved" : "Available"));
        }
    }

    public static void main(String[] args) {
        System.out.println("\n=====Bus Reservation System=====");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seats on the bus: ");
        int numSeats = scanner.nextInt();

        BusReservation busReservation = new BusReservation(numSeats);

        while (true) {
            System.out.println("----------------------");
            System.out.println("Menu:");
            System.out.println("1. Reserve a seat");
            System.out.println("2. Display seat availability");
            System.out.println("3. Exit");
            System.out.println("----------------------");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter seat number to reserve: ");
                    int seatNumber = scanner.nextInt();
                    busReservation.reserveSeat(seatNumber);
                    break;
                case 2:
                    busReservation.displaySeats();
                    break;
                case 3:
                    System.out.println("Thank you for using the bus reservation system.");
                    System.out.println("-----------------Exit--------------");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}