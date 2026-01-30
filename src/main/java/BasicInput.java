import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        int userInt;
        double userDouble;
        char userChar;
        String userString;

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter integer:");
        userInt = scnr.nextInt();
        System.out.println("Enter Double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter Char:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter String:")
        userString = scnr.nextString;

        system.out.printf("%f %f %f %fn", userInt, userDouble, userChar, userString)

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}