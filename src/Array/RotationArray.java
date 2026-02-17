package Array;

import java.util.Scanner;

public class RotationArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int k= 70;
       // Scanner sc=new Scanner(System.in);
        rotate(arr,k);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    public static void rotate(int arr[],int k) {
        int n= arr.length;
        k=k%n;
        while (k > 0) {//k=1
            int last_element = arr[arr.length - 1]; //7
            int i = arr.length - 1;//5
            while ((i >0)) {  //1>0
                arr[i] = arr[i - 1]; //
                i--;
            }
            arr[0] = last_element;
            k--;

        }
    }
}
