package numberPattern;

import java.util.Scanner;

public class numberPattern3 {

        public static void main(String args[]){
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int row=1;
            int star=1;
            int space=n-1;
            int j=1;
            while(row<=n){
                int s=1;
                while (s<=space){
                    System.out.print("   ");
                    s++;
                }
                int i=1;
                while (i<=star){
                    System.out.print(+j+"  ");
                    i++;
                    j++;
                }
                space--;
                star+=2;
                row++;
                System.out.println();
            }

        }
}
