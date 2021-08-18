package com.company;

public interface MyLinkedListNodeList {
    MyLinkedListItem getRoot();
    boolean  addItem(MyLinkedListItem myLinkedListItem);
    boolean removeItem(MyLinkedListItem myLinkedListItem);
    void traverse(MyLinkedListItem root);


}
