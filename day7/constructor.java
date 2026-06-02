class Student{
    String name;
    int age;
    //Default constructor
    Student(){
        name="default";
        age=20;
    }
    //Parameterized constructor
Student(String name,int age){
    this.name=name;
    this.age=age;
}
Student(String name){
    this.name=name;
    age=21;
}

    public void display(){
        System.out.println("Name: "+name +" Age: "+age);
    }
}
public class constructor{
    public static void main(String[] args){
        Student student1=new Student();
        
        student1.display();
    }
}