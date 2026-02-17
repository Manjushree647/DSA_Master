import java.util.Scanner;

public class trapaziam {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n){
            int s=1;
            while (s<=space){
                System.out.print("   ");
                s++;
            }
            int i=1;
            while (i<=star){
                System.out.print(" * ");
                i++;
            }
            space--;
            star+=2;
            row++;
            System.out.println();
        }

    }
}
