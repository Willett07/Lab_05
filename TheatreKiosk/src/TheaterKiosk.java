import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 0;
        String trash = "";

        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine(); // clear buffer

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
            // Do nothing if age < 21

        } else {
            trash = in.nextLine(); // capture bad input
            System.out.println("Error: \"" + trash + "\" is not a valid age.");
            System.out.println("Run the program again with a valid number.");
        }
    }
}
