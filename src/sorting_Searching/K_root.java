package sorting_Searching;

public class K_root {
    public static void main(String[] args) {
        int n=87;
        int k=3;
        System.out.println(krootfind(n,k));
    }

    public static int krootfind(int n, int k) {
        int low=1;
        int hig=n;
        int ans=0;
        while (low<=hig){
            int mid=(low+hig)/2;
            if(Math.pow(mid,k)<=n){ // check condition as x^k<=n
                ans=mid;            //update and with mid value
                low=mid+1;

            }
            else
                hig=mid-1;

        }
        return ans;
    }
}
