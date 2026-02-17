import java.util.Scanner;

public class mirror3 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = n - 1;
        while(row<=n*2-1){  // rows

            //print space
            int s=1;
            while (s <=space) {
                System.out.print("   ");
                s++;
            }
            //print star
            int i = 1;
            while (i <= star) {
                System.out.print(" * ");
                i++;
            }
            if(row<n){
            star--;
            space--;}
            else{
                star++;
                space++;
            }
            row++;
            System.out.println();
        }

     }
}
