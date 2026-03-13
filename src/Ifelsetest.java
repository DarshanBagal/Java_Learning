import java.lang.*;
import java.util.Scanner;

public class Ifelsetest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println("this Number is even");
            } else {
                System.out.println("this Number is odd");
            }
        }

    }
}