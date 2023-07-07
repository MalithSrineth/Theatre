import java.util.Arrays;
import java.util.Scanner;

public class Theatre {
    static int [] firstRow = new int[12];
    static int [] secondRow = new int[16];
    static int [] thirdRow = new int[20];

    static int[][] rows = {firstRow, secondRow, thirdRow};

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the New Theatre");

        Arrays.fill(firstRow, 0);
        Arrays.fill(secondRow, 0);
        Arrays.fill(thirdRow, 0);


        int choice;
        do {
            printMenu();
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    //buy Ticket
                    buyTicket();
                    break;
                case 2:
                    //print seating area
                    printSeatingArea();
                    break;
                case 3:
                    //cancel Ticket
                    break;
                case 4:
                    //list available seats
                    break;
                case 5:
                    //save to file
                    break;
                case 6:
                    //load from file
                    break;
                case 7:
                    //print ticket info
                    break;
                case 8:
                    //sort
                    break;
                default:
                    System.out.println("Wrong Input Please Enter a valid Number.");
                    break;
            }
        } while (choice != 0);


    }
    private static void printMenu() {
        System.out.println("-------------------------------------------------");
        System.out.println("Please select an option:");
        System.out.println("\n1) Buy a ticket");
        System.out.println("2) Print seating area");
        System.out.println("3) Cancel ticket");
        System.out.println("4) List available seats");
        System.out.println("5) Save to file");
        System.out.println("6) Load from file");
        System.out.println("7) Print ticket information and total price");
        System.out.println("8) Sort tickets by price");
        System.out.println("0) Quit");
        System.out.println("-------------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    private static void buyTicket() {
        int rowNumber, seatNumber;

        int[] seatsPerRow = {12, 16, 20};

        rowNumber = scanner.nextInt();
        if (rowNumber < 1 || rowNumber > seatsPerRow.length) {
            System.out.println("Wrong Row Number. Please Try Again");
            buyTicket();
            return;
        }

        int maxSeatNumber = seatsPerRow[rowNumber - 1];

        do {
            seatNumber = scanner.nextInt();
            if (seatNumber < 1 || seatNumber > maxSeatNumber) {
                System.out.println("Wrong Seat Number. Please Try Again");
            } else {
                break;
            }
        } while (true);

        rows[rowNumber - 1][seatNumber - 1] = 1;
    }

    private static void printSeatingArea(){
        System.out.println("     ***********");
        System.out.println("     *  STAGE  *");
        System.out.println("     ***********");
        for (int[] row: rows) {
            int count=0;

            if (row.length==12){
                System.out.print("    ");
            } else if (row.length==16){
                System.out.print("  ");
            }

            for (int seats:row) {
                if (count==(row.length/2)){
                    System.out.print(" ");
                }

                if (seats==1){
                    System.out.print("X");
                } else {
                    System.out.print("O");
                }
                count++;

            }
            System.out.println("");

        }
    }
}
