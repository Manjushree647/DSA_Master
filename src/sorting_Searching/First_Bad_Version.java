package sorting_Searching;

public class First_Bad_Version {
    public static void main(String[] args) {
        int n=100;
        System.out.println(firstbadversion(n));
    }
    public static boolean isBadVersion(int mid){
        return false;
    }
    public static int firstbadversion(int n) {
        int low=1;
        int high=n;
        int bad=0;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(isBadVersion(mid)==true){
                bad=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return bad;
    }

}
