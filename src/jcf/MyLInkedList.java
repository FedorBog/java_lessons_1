package jcf;

import java.util.Arrays;

public class MyLInkedList {

    private Node head;
    private int size;

    public void add(int value) {

        if (head == null) {
            this.head = new Node(value);
        } else {
            Node last = head;
            while (last.getNext() != null) {
                last = last.getNext();
            }
            last.setNext(new Node(value));
        }
        size++;
    }

    public int get(int index){

        int currIndex = 0;
        Node temp = head;

        while( temp != null ){
            if (currIndex == index){
                return temp.getValue();
            }
            temp = temp.getNext();
            currIndex++;
        }

        throw new IllegalArgumentException();
    }

    public void  remove(int index){

        if (index == 0){
            head = head.getNext();
            size--;
            return;
        }

        int currIndex = 0;
        Node temp = head;

        while( temp != null ){
            if (currIndex == index - 1){
                temp.setNext(temp.getNext().getNext());
                size--;
                return;
            }else{
                temp = temp.getNext();
                currIndex++;
            }
        }
    }

    public String toString(){

        int[] result = new int[size];
        int index = 0;
        Node temp = head;

        while( temp != null ){
            result[index++] = temp.getValue();
            temp = temp.getNext();
        }

        return Arrays.toString(result);
    }

    private class Node {

        private Node next;
        private int value;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
