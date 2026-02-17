import java.util.Scanner;

public class Dimondepattern {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int space1 = n + 2;
        int space2 = -1;
        int star = 1;
        int val = 1;
        int row = 1;
        while(row<=n*2-1) { //row
            //space1
            int s=0;
            while (s < space1) {
                System.out.println("  ");
                s++;
            }

            //star 1
            int i = 1;
            int j = val;
            while (i <= star) {
                if (row <= n) {
                    System.out.print(j+" ");
                    i++;
                    val--;
                } else {
                    System.out.print(j+" ");
                    i++;
                    val--;
                }
            }
            if(row<n)
                val++;
            else val--;
        }
    }
}
