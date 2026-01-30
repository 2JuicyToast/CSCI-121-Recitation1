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
        System.out.println("Enter double:");
        userDouble = scnr.nextDouble();
        System.out.println("Enter char:");
        userChar = scnr.next().charAt(0);
        System.out.println("Enter string:");
        userString = scnr.next();

        System.out.printf("%d %.2f %c %s%n", userInt, userDouble, userChar, userString);

        System.out.printf("%s %c %.2f %d%n", userString, userChar, userDouble, userInt);

        int newInt = (int)userDouble;
        System.out.printf("%.2f %s %d", userDouble, "cast to an integer is", newInt);

        // TODO (1): Finish reading other items into variables, then output the four values on a single line separated by a space

        // TODO (2): Output the four values in reverse

        // TODO (3): Cast the double to an integer, and output that integer

    }
}