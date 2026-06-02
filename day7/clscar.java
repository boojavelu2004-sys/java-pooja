class Car{
    String brand;
    int speed;
    public void drive(){
        System.out.println(brand + " is driving at " + speed + "km");
    }
}
public class clscar{
    public static void main(String[] args){
         Car car1=new Car();
        car1.brand="BMW";
        car1.speed=1000;
        car1.drive();
    }
}