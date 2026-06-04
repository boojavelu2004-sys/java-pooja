import java.util.*;
public class setunique{
    public static void main(String[] agrs){
        Set<Integer> s=new HashSet<>();
        int[] arr={1,2,3,11,2,3};
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                
                System.out.println(arr[i]);            
                
            }
        
             s.add(arr[i]);
        }
    }
}