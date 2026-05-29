public class voidover{
    public int addTwoNumbers(int a,int b){
        int c=a+b;
        return c;
    }
    static void change(int x){
        x=500;
        System.out.println("Inside method:"+x);
    }
    public static void main(String[] args){
        int y=5;
        change(y);
        System.out.println("outside method:"+y);
        voidover a=new voidover();
        System.out.println(a.addTwoNumbers(11,22));
    }
}