import java.util.Scanner;

public class mirror2 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while (row <= (n * 2) - 1) {//row loop

            //space loop upper part
            int s = 1;
            while (s <=space) {
                System.out.print("   ");
                s++;
            }

            int i = 1;
            while (i <= star) {
                System.out.print(" * ");
                i++;
            }
            if (row < n) {
                star++;
                space--;
            } else {
                star--;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
