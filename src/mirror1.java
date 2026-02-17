import java.util.Scanner;

public class mirror1 { //horizontal mirror
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int row=1;
        int star=1;
        while(row<=(n*2)-1) {//row loop
            int i=1;
            while(i<=star){
                System.out.print(" * ");
                i++;
            }
            if(row<n){
              star++;}
            else {
                star--;}
            row++;
            System.out.println();
        }
    }
}
