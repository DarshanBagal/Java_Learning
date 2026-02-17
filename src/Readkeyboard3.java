import java.util.Scanner;
public class Readkeyboard3 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        sc.useRadix(2);
        int x=sc.nextInt();
        System.out.println(x);
    }
}
//binary to decimal
