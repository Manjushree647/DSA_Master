package Program_Most;

import java.util.Scanner;

public class BinayToDecimal {

    public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int mul =1;
    int rem;
    int sum = 0;
    while (n > 0) {
        rem = n % 10;
        sum = sum + rem * mul;
        mul = mul * 2;
        n = n / 10;
    }
    System.out.println(sum);
}
}
