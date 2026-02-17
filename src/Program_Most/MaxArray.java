package Program_Most;

public class MaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 40, 60};
        int maxno=searchmax(arr);
        System.out.println("Max num of array :"+maxno);

    }
    public static int searchmax(int arr[]){
        int i=0;
        int maxno=arr[0];
        for (i=0;i< arr.length;i++){
            if(maxno<arr[i])
                maxno=arr[i];
        }
        return maxno;
    }
}
