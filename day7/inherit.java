class User {
    String name;
    String phone;
    String location;
    User(String name,String phone,String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    } 
    public void basicInfo(){
        System.out.println(name +" "+ phone+" " +location);
    }
}
class FoodUser extends User{
    String favFood;
    FoodUser(String name,String phone,String location,String favFood ){
        super(name,phone,location);
        this.favFood=favFood;
    }
    public void userDetails(){
        basicInfo();
        System.out.println("favourite food:" +favFood);

    }
}


public class inherit{
    public static void main(String[] args){
        FoodUser user1=new FoodUser("foodie","7695855254","Chennai","Briyani");
        user1.userDetails();
    }

}