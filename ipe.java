import java.util.Scanner;

public class ipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------ Welcome to I3 Typing Master v2026 -----------");
        System.out.println("To begin, please select one of the following options:");
        System.out.println("  1. Login");
        System.out.println("  2. Register");
        System.out.println("  3. Exit");
        System.out.print("Choose an option: - ");

        int choice = scanner.nextInt();

        // Optional: simple handling
        switch (choice) {
            case 1:
                System.out.println("You chose Login.");
                break;
            case 2:
                System.out.println("You chose Register.");
                break;
            case 3:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}