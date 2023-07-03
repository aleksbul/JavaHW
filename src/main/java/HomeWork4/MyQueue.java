package HomeWork4;

import java.util.LinkedList;

public class MyQueue {
    private LinkedList elements;

    public MyQueue(LinkedList linkedList) {
        this.elements = linkedList;
    }
    public void enqueue(int e){
        this.elements.addLast(e);
    }
    public int dequeue(){
        return (int) this.elements.removeFirst();
    }

    public int first(){
        return (int) this.elements.getFirst();
    }

    public void show() {
        System.out.println(this.elements);
    }
}
