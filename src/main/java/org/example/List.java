package org.example;

import java.util.Iterator;

public class List implements Iterable {
    Node head;
    Node tail;

    public void add(Object value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
    }

    public boolean contain(Object value) {
        this.tail = this.head;
        System.out.println("Value: " + value);
        while (tail != null) {
            if (tail.value.equals(value)) {
                return true;
            }
            tail = tail.next;
        }
        return false;
    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    @Override
    public Iterator iterator() {
        this.tail = this.head;
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return tail != null;
            }

            @Override
            public Object next() {
                Node current = tail;
                tail = tail.next;
                return current.value;
            }

            @Override
            public void remove() {
            }
        };
    }
}
