public class methodover{
    public int addTwoNumbers(int a,int b,int c){
        int d=a+b+c;
        return d;
    }
    static void change(int x){
        x=500;
        System.out.println("Inside method:"+x);
    }
    public static void main(String[] args){
        int y=5;
        change(y);
        System.out.println("outside method:"+y);
        methodover a=new methodover();
        System.out.println(a.addTwoNumbers(11,22,33));
    }
}