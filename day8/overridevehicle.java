class vehicle{
    public void start(){
        System.out.println("start vehicles");
    }
}
class car extends vehicle{
    public void start(){
        System.out.println("Car  is started");
    }
}
class bike extends vehicle{
    public void start(){
        System.out.println("Bike is started");
    }
}
class bus extends vehicle{
    public void start(){
        System.out.println("Bus is started");
    }
}
public class overridevehicle{
    public static void main(String[] args){
        car c=new car();
        c.start();
        bike b=new bike();
        b.start();
        bus b1=new bus();
        b1.start();
    }
}