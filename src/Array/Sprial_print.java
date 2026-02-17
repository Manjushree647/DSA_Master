package Array;

public class Sprial_print {
    public static void main(String[] args) {
        int [][]arr={ {1,2,3,4,},
                {5,6,7,8},
                { 9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}};
        sprialprintmatrix(arr);
    }
    public static void sprialprintmatrix(int arr[][]){
        int minr=0;
        int maxrow=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int  total_element=arr.length*arr[0].length;
        int count=0;
        while (count<total_element){
            for(int i=minc;i<=maxc &&count<total_element;i++){
                System.out.print(" "+arr[minr][i]);
                count++;
            }
            minr++;
            for(int i=minr;i<=maxrow && count<total_element;i++){
                System.out.print(" "+arr[i][maxc]);
                count++;
            }
            maxc--;
            for (int i=maxc;i>=minc &&count<total_element;i--){
                System.out.print(" "+arr[maxrow][i]);
                count++;
            }
            maxrow--;
            for (int i=maxrow;i>=minr &&count<total_element;i--){
                System.out.print(" "+arr[i][minc]);
                count++;
            }
            minc++;
        }
    }
}
