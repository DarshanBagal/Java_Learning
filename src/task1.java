import java.lang.*;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();

        System.out.println("String:"+s);
        System.out.println("Double:"+d);
        System.out.println("Integer:"+i);

        scanner.close();
    }
}