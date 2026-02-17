package Array;
    //filled with 1 - n^2 value in sprial order
public class sprialmatrix59 {
    public static void main(String[] args) {
        int n=3;
        sprilmatrixfield(n);
    }
    public static void sprilmatrixfield(int n){
        int [][]arr=new int[n][n];
        int minr=0;
        int maxrow=n-1;
        int minc=0;
        int maxc=n-1;
        int  total_element=n*n; //n by n matrix (square matrix)
        int count=0;
        int no=1;
        while (count<total_element){ //to get all element without repeating

            for(int i=minc;i<=maxc &&count<total_element;i++){ //first row
                arr[minr][i]=no;
                no++;
                count++;

            }
            minr++;
            for(int i=minr;i<=maxrow && count<total_element;i++){ //last column
               arr[i][maxc]=no;
                no++;
                count++;

            }
            maxc--;
            for (int i=maxc;i>=minc &&count<total_element;i--){// last row
                arr[maxrow][i]=no;
                no++;
                count++;
            }
            maxrow--;
            for (int i=maxrow;i>=minr &&count<total_element;i--){ //first column from last to min row
                arr[i][minc]=no;
                no++;
                count++;
            }
            minc++;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print( " "+arr[i][j]);
            }
            System.out.println( );
        }
    }

}
