package Program_Most;

import java.util.Scanner;

public class DimonadP
{
    //declare the things which req
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        //row 1 to n
        int row =1; //1 to n
        //space init
        int space1=num+2;
        int space2=-1;
        int value=1;
        //star init
        int Star1=1;//inc
        int star2=1;

        while (row<=num*2-1)
        {
            //space 1 decl
            int s1=0;
            while (s1<space1)
            {
                System.out.print("  ");
                s1++;
            }
            //star print
            int var=value;
            int i=0;
            while (i<Star1)
            {
                System.out.print(var+" ");
                var--;
                i++;
            }
            //space 2nd
            int sp2=0;
            while (sp2<space2)
            {
                System.out.print("  ");
                sp2++;
            }
            //star2
            int j=0;

            while (j<star2 && row>1 && row<num*2-1)
            {
                System.out.print((var+1)+" ");
                j++;
                var++;
            }

            //mirror condn
            if (row<num)
            {
                space1-=2;
                space2+=2;
                Star1++;
                star2++;
                value++;
            }
            else
            {
                space1+=2;
                space2-=2;
                Star1--;
                value--;
                star2--;
            }
            row++;
            System.out.println();
        }

    }
}
