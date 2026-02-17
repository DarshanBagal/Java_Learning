
import java.util.Scanner;

public class Readkeyboard2 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object

        int x, y;

        System.out.println("Enter 2 numbers:");

        x = sc.nextInt();   // Correct method name
        y = sc.nextInt();   // Correct method name

        int z = x + y;

        System.out.println("Sum is " + z);

        sc.close();   // Close Scanner
    }
}
