import java.util.Arrays;
import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the New Theatre");
        int [] firstRow = new int[12];
        int [] secondRow = new int[16];
        int [] thirdRow = new int[20];

        Arrays.fill(firstRow, 0);
        Arrays.fill(secondRow, 0);
        Arrays.fill(thirdRow, 0);

        printMenu();
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                //buy Ticket
                break;
            case 2:
                //print seating area
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
}
