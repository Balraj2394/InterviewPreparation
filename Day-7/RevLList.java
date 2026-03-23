import java.util.*;
class Node{
    int data;
    Node next;
    Node(int num){
        this.data=num;
        this.next=null;
    }
}

class Solu{
    Node rev(Node head){
        Node curNode=head;
        Node prevNode=null;
        while(curNode!=null){
            Node next=curNode.next;
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=next;
        }
        return prevNode;
    }
}

public class RevLList{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=null,tail=null;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            Node newNode=new Node(num);
            if(head==null){
                head=tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        Solu obj=new Solu();
        head=obj.rev(head);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
}