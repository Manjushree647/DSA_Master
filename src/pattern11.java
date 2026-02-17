public class pattern11 {
    public static void main(String args[]){
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        while(row<=n){
            int s=1;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int i=1;
            while(i<=star){
                System.out.print(" * ");
                System.out.print("  ");
                i++;
            }
            star++;
            space--;
            row++;
            System.out.println();

        }
    }
}
