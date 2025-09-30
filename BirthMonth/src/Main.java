import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int month = 0;
        String trash = "";

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            trash = in.nextLine(); // capture bad input
            System.out.println("Error: \"" + trash + "\" is not a valid integer.");
            System.out.println("Run the program again with a number between 1 and 12.");
        }
    }
}
