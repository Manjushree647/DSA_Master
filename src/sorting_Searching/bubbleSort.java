package sorting_Searching;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr={5 ,3,1,4,2};
        int n= arr.length;
        for(int i=1;i<=n;i++){ //i=0
            //outer loop n-1
            for(int j=0;j<n-i;j++){
                if(arr[j] >arr[j+1]){ //5<3
                    int temp=arr[j];    //3
                    arr[j]=arr[j+1];//
                    arr[j+1]=temp;

                }
                //i increses
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
