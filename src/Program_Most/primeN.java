package Program_Most;

import java.util.Scanner;

public class primeN {
    public static  void main(String args[]) {
        //prime number
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
              count++;
        }
        if(count>=1)
            System.out.println("Not prime");
        else
            System.out.println("prime");
    }
}
