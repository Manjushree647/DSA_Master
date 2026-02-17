public class pattern12 {
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
                int j=i;
                while(i<=star){
                    if(j%2==1) {
                        System.out.print(" * ");
                        i++;
                        j++;
                    }
                    else{
                        System.out.print(" ! ");
                        j++;

                    }
                }
                star++;
                space--;
                row++;
                System.out.println();

            }
        }
    }


