import java.sql.SQLOutput;
import java.util.Scanner;

public class blankSquarep {
    public static  void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int row=1;
        int star=5;
        int space=n-2;
        while(row<=n){
            if(row==1||row==5){
                int i=1;
                while(i<=star){
                    System.out.print(" * ");
                    i++;
                }
            }
            else{
                System.out.print(" * ");
                int s=0;
                while(s<space){
                    System.out.print("   ");
                    s++;
                }
                System.out.print(" * ");
            }
            row++;
            System.out.println();
        }

    }
}