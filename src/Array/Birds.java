package Array;
//interface with functional limitations..!
@FunctionalInterface
interface CanFly
{
    void fly();
    default void display(){
        System.out.println(" i am default");
    }
}

public class Birds {
    public static void main(String[] args) {
    CanFly cf=new CanFly() {
        public void fly() {
            System.out.println("HEY  I AM PRIVATE CAN FLY");
        }
    };
    cf.fly();
    }

}
