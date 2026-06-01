public class string{
    public static void main(String[] args){
        String s1="Hello";
        s1=s1.concat("World");
        System.out.println(s1);
        StringBuilder sb=new StringBuilder
        ("Java");
        sb.append(" programming");
        System.out.println(sb.charAt(6));
        System.out.println(sb.reverse());
        String a="Hello";
        String b=new String("Hello");
        System.out.println(a==b);
        System.out.println(a.equals(b));


    }
}