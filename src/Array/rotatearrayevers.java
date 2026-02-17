package Array;

public class rotatearrayevers {
    public static  void main(String[] args){
        //reverse the array
        int [] arr={1,2,3,4,5,6,7};
        int i=0;
        int k=3;
        int j= arr.length-1;
      rotate(arr,k);
        for(int i1=0;i1<arr.length;i1++){
            System.out.print(arr[i1]);
        }

    }
    public static void rotate(int arr[],int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr,0,n-k-1);//last k element
        reverse(arr,n-k,n-1);//last element
        reverse(arr,0,n-1);
    }
    public static void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
