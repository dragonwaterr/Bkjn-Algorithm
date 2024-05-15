import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hr = sc.nextInt();
        int mn = sc.nextInt();

        int a = (hr*60) + mn;

        if(hr == 0 && mn < 45) {
            hr = 23;
            mn += 15;
            System.out.println(23+" "+mn);
        }
        else {
            a = a-45;
            System.out.println(a/60+" "+a%60);
        }

    }
}
