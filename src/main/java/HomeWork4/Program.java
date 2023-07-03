package HomeWork4;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class Program {
    static Random random = new Random();

    public static void main(String[] args) {

        Task1();
        Task2();
    }

    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

    static LinkedList Task1() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int size = 10;
        for (int i = 0; i < size; i++) {
            linkedList.add(random.nextInt(0, 10));
        }
        System.out.println(linkedList);
        LinkedList<Integer> reverse = new LinkedList<Integer>();
        while (!linkedList.isEmpty()) {
            int n = linkedList.removeLast();
            reverse.add(n);
        }
        System.out.println(reverse);
        return reverse;
    }

    static void Task2() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        MyQueue myQueue = new MyQueue(linkedList);
        myQueue.show();
        myQueue.enqueue(4);
        myQueue.show();
        System.out.println(myQueue.dequeue());
        myQueue.show();
        System.out.println(myQueue.first());
        myQueue.show();
    }
}
