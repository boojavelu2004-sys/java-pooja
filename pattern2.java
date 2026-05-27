import java.util.Scanner;
public class pattern2{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        
            for(int i=1;i<=5;i++){
                for(int j=1;j<=i-1;j++){
                   System.out.print("*");
            }
                   System.out.println();
        }
    }
}