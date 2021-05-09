package com.Saurabh;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlist {
    Node head = null;
    void insertAtEnd(int data){
        if(head==null)
            head=new Node(data);
        else{
            Node newNode= new Node(data);
            Node tempNode=head;
            while(tempNode.next!=null)
                tempNode=tempNode.next;
            tempNode.next=newNode;
        }
    }
    void printMiddle()
    {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null)
        {
            while (fast_ptr != null && fast_ptr.next != null)
            {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println(
                    slow_ptr.data + " \n");
        }
    }

}
