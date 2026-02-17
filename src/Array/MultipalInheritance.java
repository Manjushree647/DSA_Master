package Array;
@FunctionalInterface
interface A{

    void fly();

   default void play(){
       System.out.println("A");
       systemhack();
       gituserSyssteminfo();
   }
   private void systemhack(){
       System.out.println("nice meeting with uu");
   }
   static private void  gituserSyssteminfo(){
        System.out.println(" i am private");
       System.out.println(10+20);
   }

}
/*interface B extends A{
    default void play(){
        System.out.println("B");
    }
}*/