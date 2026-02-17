package numberPattern;
import java.util.Scanner;

public class numberp {
        public static void main(String args[]){
            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int row=1;
            int star=1;
            int space=n/2;
            while(row<=n){
                int s=1;
                while (s<=space){
                    System.out.print("   ");
                    s++;
                }
                int i=1;
                int j=1;
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
                }
                else {
                    space++;
                    star -= 2;
                }
                row++;
                System.out.println();
            }

        }
}
