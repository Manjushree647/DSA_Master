import java.util.*;
public class UmbrelaPattern {
        public static void main(String args[]){
            int n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            int row=0;
            int space=0;
            int star=n;
            while(row<n){
                int s=0;
                while(s<space){
                    System.out.print("  ");
                    s++;
                }
                int i=0;
                while(i<star){
                    System.out.print("* ");
                    i++;
                }
                space=space+2;
                star--;
                row++;
                System.out.println(" ");

            }

        }
    }
