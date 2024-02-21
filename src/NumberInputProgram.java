import java.util.Scanner;

public class NumberInputProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        StringBuilder inputNumbers = new StringBuilder();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input a number");
            System.out.println("2. Display input numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number (or -1 to go back to the menu): ");
                    input = scanner.nextInt();
                    while (input != -1) {
                        inputNumbers.append(input).append(" ");
                        System.out.print("Enter a number (or -1 to go back to the menu): ");
                        input = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("\nInput numbers:");
                    System.out.println(inputNumbers.toString().trim());
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
