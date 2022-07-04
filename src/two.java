
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int k;

        System.out.println("Lutfen ust sinir numarasini giriniz:" );
        k = input.nextInt();

        for (int i = 1; i <= k; i *= 4) {
            System.out.println(i);
        }
        for (int n = 1; n <= k; n *= 5){

            System.out.println(n);
    }
}}
