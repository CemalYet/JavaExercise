package com.company;

public abstract class MyLinkedListItem {
    protected MyLinkedListItem rightLink = null;
    protected MyLinkedListItem leftLink = null;
    protected Object value;

    public MyLinkedListItem(Object value) {
        this.value = value;
    }

     abstract MyLinkedListItem next();
     abstract MyLinkedListItem setNext(MyLinkedListItem myLinkedListItem);
     abstract MyLinkedListItem previous();
     abstract MyLinkedListItem setPrevious(MyLinkedListItem myLinkedListItem);
     abstract int  compareTo(MyLinkedListItem myLinkedListItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
