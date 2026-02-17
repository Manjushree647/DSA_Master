package Program_Most;

import java.util.Scanner;

public class SumDigit {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum=0;
        for (;n>0;){    //123
            int rem=n%10; //123%10=3
            sum=rem+sum;  //sum=3
            n=n/10;      //12
        }
        System.out.println("sum of digit:"+sum);
    }
}
