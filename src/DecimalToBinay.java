import java.util.Scanner;

public class DecimalToBinay {

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int mul =1;
        int rem;
        int sum = 0;
        while (n > 0) {
            rem = n % 2;
            sum = sum + rem * mul;
            mul = mul * 10;
            n = n / 2;
        }
        System.out.println(sum);
    }
}
