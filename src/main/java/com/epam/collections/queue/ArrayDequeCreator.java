package com.epam.collections.queue;

import java.util.*;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> myArrayDeque = new ArrayDeque<>();
        myArrayDeque.add(firstQueue.remove());
        myArrayDeque.add(firstQueue.remove());
        myArrayDeque.add(secondQueue.remove());
        myArrayDeque.add(secondQueue.remove());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()){
            firstQueue.add(myArrayDeque.removeLast());
            myArrayDeque.add(firstQueue.remove());
            myArrayDeque.add(firstQueue.remove());
            secondQueue.add(myArrayDeque.removeLast());
            myArrayDeque.add(secondQueue.remove());
            myArrayDeque.add(secondQueue.remove());
        }
        return myArrayDeque;
    }
}
