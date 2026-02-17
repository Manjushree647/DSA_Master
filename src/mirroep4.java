import java.util.Scanner;

public class mirroep4 {

    public static void main(String args[]) {
        int n;//7
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int row = 1;//
        int space1 = n/2; //3 7/2
        int space2=-1;
        while (row <=n) { //1
            //print space 1
            int s=1;
            while (s <=space1) {
                System.out.print("    ");
                s++;
            }
            //print 1st star

                System.out.print(" * ");
            //space 2
            int s2=1;
            while (s2 <=space2) {
                System.out.print("    ");
                s2++;
            }
            //row 1 and last row star
            if (row!=1 && row!=n){
            System.out.print(" * ");}

            //space before mirror
             if (row<=n/2) {
                space1--;
                space2+=2;
            }
            else
            {
                space1++;
                space2-=2;
            }
            row++;
            System.out.println();
        }
    }
}
