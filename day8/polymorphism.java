class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    //method overloading
    public int add(int a,int b,int c){
        return a+b+c;
    }
}
public class polymorphism{
    public static void main(String[] args){
        Calculator calc=new Calculator();
        System.out.println(calc.add(11,22 ,33));
    }
}