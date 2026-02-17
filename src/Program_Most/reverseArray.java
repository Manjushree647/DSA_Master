package Program_Most;

public class reverseArray {
    public static  void main(String[] args){
        //reverse the array
        int [] arr={10,20,30,40,50};
        int i=0;
        int j= arr.length-1;
        reverse( arr,i,j);
        for(int i1=0;i1<arr.length;i1++){
            System.out.println(arr[i1]);
        }

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
