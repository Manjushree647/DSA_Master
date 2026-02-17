package Array;

public class OptimizeApproch238 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(ProductArray(arr));
    }

    public static int[] ProductArray(int[] arr) {
        int n = arr.length;
        //claculating left side array multiplication
        int left[]=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];//
        }
        int right[]=new int[n];
        right[n-1]=1;
        for(int i=0;i<n;i++){
         right[i]=right[i]*arr[i+1];//
        }
        for (int i=0;i<n;i++)  {
            arr[i]=left[i]*right[i];
        }
        return arr;
    }
}
