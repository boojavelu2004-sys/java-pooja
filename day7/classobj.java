class Student{
    String name;
    int age;
    public void display(){
        System.out.println("Name: "+name +" Age: "+age);
    }
}
public class classobj{
    public static void main(String[] args){
        Student student1=new Student();
        student1.name="Pooja";
        student1.age=21;
        student1.display();
    }
}