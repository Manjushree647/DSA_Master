package Array;

public class Search2D {
    public static void main(String[] args) {
        int [][]arr={ {1,2,3,4,},
                {5,6,7,8},
                { 9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}};
        int target=21;
        boolean result=searhmatrix(arr,target);
        if (result==true)
            System.out.println(" target elements is found");
        else
            System.out.println("target element not found..");
    }
    public static boolean searhmatrix(int arr[][],int target){
               int col=arr[0].length-1;
               int row=0;
            while(row < arr.length && col>=0){
            if(arr[row][col]==target)
            {   return true;
            }
            else if (arr[row][col]<target) { //search in next row
                row++;
            }
            else { //search in next column
                col--;
            }

            }
            return false;
    }

}
