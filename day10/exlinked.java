class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    Node head;

}
void insert(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;

    }
    temp.next=nextNode;
}
void display(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
public class exlinked{
    public static void main(String args[]){
        Node first=new Node(10);
        Node sec=new Node(20);
        Node third=new Node(30);
        first.next=sec;
        sec.next=third;

        Node temp=first;
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");


    }
}
