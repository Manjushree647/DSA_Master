package Program_Most;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String args[]) {
        //n as fibonacci
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i=1;
        int a=0;
        int b=1;
        while(i<=n){
            System.out.print( a );//series print
            int c=a+b;
            a=b;
            b=c;
            i++;
        }
        System.out.print( a );//last element
    }
}
