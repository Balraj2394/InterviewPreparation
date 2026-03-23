import java.util.*;
class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
        this.next=null;
    }
}
class Res{
    Node middleNode(Node head){
        Node sin=head;
        Node dub=head;
        while(dub!=null && dub.next!=null){
            sin=sin.next;
            dub=dub.next.next;
        }
        return sin;
    }
}
public class MidLList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            Node newNode=new Node(num);
            if(head==null){
                head=tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        Res obj=new Res();
        head=obj.middleNode(head);
        System.out.println(head.data);
    }

}