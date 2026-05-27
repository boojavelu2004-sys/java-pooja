import java.util.Scanner;
public class remain{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(n>0){
            int remainder=n%10;
            sum+=remainder;
            n/=10;
        }
        System.out.println(sum);
    }
}   