interface camera{
    void clickphoto();
}
interface musicplayer{
    void playmusic();
}
class phone implements camera,musicplayer{
    public void clickphoto(){
            System.out.println("photo taken from mobile");
        public void playmusic(){
            System.out.println("music playing");
        }
    }
}

public class interfaceops{
    public static void main(String[] args){
        phone p2=new phone();
        p2.clickphoto();
        p2.playmusic();
    }
}