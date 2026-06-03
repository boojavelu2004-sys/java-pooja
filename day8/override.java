class animal{
    public void makesound(){
        System.out.println("Animal sound");
    }
}
class dog extends animal{
    public void makesound(){
        System.out.println("Dog Barks");
    }
}
public class override{
    public static void main(String[] args){
        dog d1=new dog();
        d1.makesound();
    }
}