package com.company;

public class MyLinkedListMyLinkedList implements MyLinkedListNodeList {
    private MyLinkedListItem root = null;

    public MyLinkedListMyLinkedList(MyLinkedListItem root) {
        this.root = root;
    }

    @Override
    public MyLinkedListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(MyLinkedListItem newItem) {
        if(this.root == null) {
            // The list was empty, so this item becomes the head of the list
            this.root = newItem;
            return true;
        }

        MyLinkedListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison <0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison >0) {
                // newItem is less, insert before
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
                return false;
            }
        }

        return false;
    }


    @Override
    public boolean removeItem(MyLinkedListItem item) {
        if(item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        MyLinkedListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                // found the item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison <0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }


    @Override
    public void traverse(MyLinkedListItem root) {
        if (root == null) {
            System.out.println("The list is empty");

        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root=root.next();
            }
        }
    }
}
