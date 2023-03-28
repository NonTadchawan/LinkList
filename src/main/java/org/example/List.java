package org.example;

public class List {
    Node head;
    Node tail;
    public void add(Object value){
        if(head==null){
            head=new Node(value);
            tail=head;
        }else {
           tail.next=new Node(value);
            tail=tail.next;
        }
    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }
}
