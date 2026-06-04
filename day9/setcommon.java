import java.util.*;
public class setcommon{
    public static void main(String[] agrs){
        Set<Integer> s=new HashSet<>();
        int[] a={1,2,3,4,5};
        int[] b={3,4,5,6,7};
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }       
                System.out.println("Common Elements:");
                for(int i=0;i<b.length;i++) {
                if(s.contains(b[i])){
                    System.out.println(b[i]);
                }           
                
            }

        
        }
}
