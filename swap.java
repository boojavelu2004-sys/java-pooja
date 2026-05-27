import java.util.Scanner;
class swap{
    public static void main(String[] args){
        Scanner pooja=new Scanner(System.in);
        System.out.println("Before swap:");
        System.out.println("Enter a number1:");
        int a=pooja.nextInt();
        System.out.println("Enter a number2:");
        int b=pooja.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap:");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
       }
}