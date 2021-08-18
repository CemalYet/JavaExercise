package com.company;

public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedListMyLinkedList list = new MyLinkedListMyLinkedList(null);
        list.traverse(list.getRoot());
        // Create a string data array to avoid typing loads of addItem instructions:
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new MyLinkedMyLinkedListNode(s));
        }
        list.removeItem(new MyLinkedMyLinkedListNode("7"));

        list.traverse(list.getRoot());


    }
}
