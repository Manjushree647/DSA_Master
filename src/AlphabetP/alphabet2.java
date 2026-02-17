package AlphabetP;

import java.util.Scanner;

public class alphabet2 {
        public static void main(String args[]) {
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int row = 1;
            int star=1;
            int space = n - 1;
            while (row <= n) {
                int s = 1;
                while (s <= space) {
                    System.out.print("  ");
                    s++;
                }
                int i=1;
                char ch = 'A';
                while (i<=star){
                    System.out.print(ch+" ");
                    if(i<=star/2){
                        ch++;
                    }
                    else {
                        ch--;
                    }
                    i++;
                }
                row++;
                star+=2;
                space--;
                System.out.println();

            }
        }
    }

