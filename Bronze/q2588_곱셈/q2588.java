import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int result1 = a*(b%10);
        int result2 = a*(b%100/10);
        int result3 = a*(b/100);
        int result4 = result1 + result2*10 + result3*100;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}