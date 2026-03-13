import java.lang.*;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Integer values");
        int i = scanner.nextInt();
        System.out.println("Enter the Double values");
        double d = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the String values");
        String s = scanner.nextLine();

        System.out.println("String:"+s);
        System.out.println("Double:"+d);
        System.out.println("Integer:"+i);

        scanner.close();
    }
}