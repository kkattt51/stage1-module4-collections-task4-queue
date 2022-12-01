package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> myQueue = new ArrayDeque<>();
        List<Integer> myList = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            myQueue.add(i);
        }

        int counter = 1;

        while (!myQueue.isEmpty()) {

            if (counter % everyDishNumberToEat != 0) {
                myQueue.offer(myQueue.poll());
            } else {
                myList.add(myQueue.poll());
            }
            counter++;
        }

        return myList;
    }
}
