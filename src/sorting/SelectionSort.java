package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={5,2,-1,6,3};
        for (int i=0;i< arr.length;i++){
            int min=i;
            for(int j=i+1;j <= arr.length-1;j++){
                if(arr[min]>arr[j]){ //5<3
                    min=j;

                }
            }
            int temp=arr[i];    //3
            arr[i]=arr[min];//
           arr[min]=temp;

        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
