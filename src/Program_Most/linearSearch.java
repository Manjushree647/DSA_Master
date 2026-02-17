package Program_Most;

public class linearSearch {

    public static void main(String[] args){
        int []arr= {10,30,20,40,60};
        int item=40;
        int  i=searchitem(arr,item);
        if (i!=-1)
            System.out.println("element found index "+i);
        else
            System.out.println("element not found any index");
    }
    public static int  searchitem(int arr[],int item){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==item){
              return i;

            }
        }
        return -1;
    }
}
