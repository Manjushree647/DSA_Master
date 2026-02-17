import java.util.Scanner;

public class XPattern {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int row, colume;
        row = 1;
        while (row <= n) {

            colume = 1;
            while (colume <= n) {
                if (colume == row || (colume + row) == n + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
                colume++;
            }
            row++;
            System.out.println();
        }
    }
}
