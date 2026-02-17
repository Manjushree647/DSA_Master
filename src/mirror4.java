import java.util.Scanner;

public class mirror4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int space1 = n + 2;
        int space2 = 0;
        int star = 1;
        int val = 1;
        int s = 1;
        int row = 1;
        //space 1
        while (s <= space1) {
            System.out.print("  ");
            s--;
        }
        if (row <= n){
            space1--;}
        else{
            space1++;}

        //star 1
        int i = 1;
        int j = val;
        while (i <= star) {
            if (row <= n) {
                System.out.print(j);
                i++;
                val--;
            } else {
                System.out.print(j);
                i++;
                val--;
            }
        }
        if(row<n)
            val++;
        else val--;
        //space2
        int s1 = 1;
        while (s1 <= space2) {
            System.out.print("  ");
            s1++;
        }
        if (row < n) {
            space2++;
        } else {
            space2--;
        }
            //star 2

            int i1 = 1;
            int j1 = val;
            while (i1 <= star && row > 1 && row < n + 3) {
                if (row <= n) {
                    System.out.print(+j1);
                    i++;
                    val++;
                    System.out.print(+j1);
                    i++;
                    val++;
                }
                if (row > n) {
                    space2++;
                    star++;
                } else {
                    space2--;
                    star--;
                }

            }
            row++;
         System.out.println();

        }
    }
