package Array;

public class ProductArray238ExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(ProductArray(arr));
    }

    public static int[] ProductArray(int[] arr) {
        int n = arr.length;
        int mulArray[] = new int[n];
        //1at loop for the number
        //2nd loop multiplication
        for (int i = 0; i < n; i++) {
            mulArray[i] = 1;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    mulArray[i]= mulArray[i] * arr[j];
                }
            }
        }
       return (mulArray);
    }
}
