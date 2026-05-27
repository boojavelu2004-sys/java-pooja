public class string{
    public static void main(String []args){
        String signal="yellow";
        switch(signal){
            case "red":
                System.out.println("Stop");
                break;
            case "green":
                System.out.println("Go");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            
            default:
                System.out.println("Invalid");
                break;    
    

        }
    }
}