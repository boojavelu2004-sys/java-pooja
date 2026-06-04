abstract class Vehicle{
    abstract void start();
    public void stop(){
        System.out.println("Stopped");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car is started");
    }
}
public class abstraction{
    public static void main(String[] args){
        Car c1=new Car();
        c1.start();
    }
}