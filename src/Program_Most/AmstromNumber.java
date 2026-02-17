package Program_Most;

import java.util.Scanner;

public class AmstromNumber {
   int coutdigit(int no)
    {
        int count=0;
        while (no>0) {
            count++;
            no = no /10;
        }
        return count;
    };
   boolean checkNo(int no,int count){
       int sum=0;
       int n=no;
        while (no>0){
            int rem=no%10;
            sum= (int) (sum+(Math.pow(rem,count)));
            no=no/10;
        }
       if(sum==n){
           return true;

       }
       else {
           return false;
       }

    }
    public static void main(String args[]){
        AmstromNumber al=new AmstromNumber();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int count=0;
        count=al.coutdigit(n);
      boolean result=al.checkNo(n,count);
      if (result==true)
          System.out.println("Enter no is amstrome number");
    else
          System.out.println("Enter no is  no amstrome number");

    }
}
