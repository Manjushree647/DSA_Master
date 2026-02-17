package numberPattern;

import java.util.Scanner;

public class hardP {
        public static void main(String args[]){
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int row=1;
            int star=1;
            int space=n/2;
            int j=1,b=1;
            while(row<=n){
                int s=1;
                while (s<=space){
                    System.out.print("   ");
                    s++;
                }
                int i=1;
                j=b;
                while (i<=star){
                    System.out.print(+j+"  ");

                   if(i<=star/2){
                        j++;}
                    else{
                        j--;
                       }
                    i++;
                }

                if(row<n/2+1) {
                    space--;
                    star += 2;
                    b++;
                }
                else {
                    space++;
                    star -= 2;
                    b--;
                }
                row++;
                System.out.println();
            }

        }
    }


