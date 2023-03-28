package org.example;

public class Main {
    public static void main(String[] args) {
        List myList = new List();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        System.out.println(myList);
        System.out.println("Contain in myList: " + myList.contain("D"));
        System.out.println("Contain in myList: " + myList.contain("F"));
        System.out.print("Item in myList: ");
        for (Object item : myList) {
            System.out.print(item + " ");
        }
    }
}
