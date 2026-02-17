/*package Array;

import java.util.Scanner;

public class countmonobitInterger {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

    }
    //convert into binary
    //count the bit
    //check the mono bit
    public static int countmonobit(int n){
        int count=0;
        for (int i=0;i<n;i++){
            if (n == 0) {
                count++;
            }

            int [] binary = new int[n];
            int i=0;
            while (n > 0) {
                int remainder = n % 2;   // get remainder (0 or 1)
                binary[i] = remainder + binary[i]; // add remainder to the front
                n = n / 2;
                for (int i=0;i<)
            }


        }
    }
}
*/