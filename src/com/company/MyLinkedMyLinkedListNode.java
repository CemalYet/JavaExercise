package com.company;

public class MyLinkedMyLinkedListNode extends MyLinkedListItem {

    public MyLinkedMyLinkedListNode(Object value) {
        super(value);
    }

    @Override
    public MyLinkedListItem next() {
        return this.rightLink;
    }

    @Override
    public MyLinkedListItem setNext(MyLinkedListItem myLinkedListItem) {
       this.rightLink = myLinkedListItem;
        return this.rightLink;
    }

    @Override
    public MyLinkedListItem previous() {
        return this.leftLink;

    }

    @Override
    public MyLinkedListItem setPrevious(MyLinkedListItem myLinkedListItem) {
        this.leftLink = myLinkedListItem;
        return leftLink;

    }

    @Override
    public int compareTo(MyLinkedListItem myLinkedListItem) {
        if (myLinkedListItem != null){
            return ((String) super.getValue()).compareTo((String) myLinkedListItem.getValue());
        }
        else{
            return -1;
        }
    }
}
