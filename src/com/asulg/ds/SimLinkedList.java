package com.asulg.ds;

public class SimLinkedList {
    int value = 0;
    SimLinkedList next = null;

    public SimLinkedList(int value){
        this.value = value;
    }

    public void insert(int value){
        SimLinkedList tail = this;
        // iterate till it finds the end
        while (tail.next != null){
            tail = tail.next;
        }

        tail.next = new SimLinkedList(value);
    }

    public void insertRecursive(int value){
        insertRec(value, this);
    }


    private void insertRec(int v, SimLinkedList sl){
        if(sl.next == null){
            sl.next = new SimLinkedList(v);
        }
        insertRec(v , sl.next);
    }

}
