package Array;

import java.util.Scanner;

public class ArrayColumePrint {
    public static void main(String[] args) {
        int row=5;
        int col=4;
        int [][]arr = new int[row][col];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i< row;i++){
            for (int j=0;j< col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
/* print column
        for(int i = 0; i <col; i++) {
            for (int j = 0; j < row; j++) {

                System.out.print(" " + arr[j][i]);
            }
            System.out.println();
        }*/

        //print the column wise array
        for(int i = 0; i <col; i++) {
            if (i%2==0){
               for (int j=0;j<row;j++){
                    System.out.print(" "+arr[j][i]);
                }
            }
            else {
                for (int j=row-1;j>=0;j--) {
                    System.out.print(" "+arr[j][i]);
                }
            }
            System.out.println();
        }
    }
}
