public class Dimoandpattern {
    public static void main(String args[]){
        int n=4;
        int space=2;
        int star=1;
        int row=1;
        int k=0;
        while(row<=(n*2)-1){
            int s=0;
            while(s<=space){
                System.out.print("  ");
                s++;
            }
            int num=0;
            while(num<star) {
                System.out.print("* ");
                num++;
                k++;
            }
            if(row<n)
            {

                star+=2;//3
                space--;//
                row++;
                System.out.println();



            }
            else{

                space++;
                star-=2;
                row++;
                System.out.println();


            }

        }
    }
}
