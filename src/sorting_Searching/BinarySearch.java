package sorting_Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int item=9;
        int result=  SearchElement(arr,item);
        if(result==-1)
            System.out.println("Element is not found");
        else
            System.out.println("Element is foundat the index :"+result);
    }
    public static int SearchElement(int arr[],int item){
        int low=0;
        int high= arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(item==arr[mid])
                return mid;
            else if (arr[mid]<item) //item is more than mid index item, changed low as mid+1
                low=mid+1;
            else
                high=mid-1; //item is less than mid index item ,changed high as mid-1
            }
        return -1;

    }
}
