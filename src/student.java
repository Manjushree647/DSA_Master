
 class teacher
{
    void display1(){
        System.out.println("Teacher method");
    }

}
 public class student extends teacher {
      void display(){
         System.out.println("student method ");
     }
     public static void main(String args[]){

        Object o=new student();

     }

 }
