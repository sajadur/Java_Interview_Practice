package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueCollection {

    public static void main(String... args){
//        queueBasicOperation();
        priorityQueue();
    }

    public static void queueBasicOperation(){
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<5;i++){
            queue.add(i);
        }

        System.out.println("Queue value is "+queue);

        queue.remove();
        System.out.println("Queue Remove "+ queue);

        int head = queue.peek();
        System.out.println("Queue head " + head);
        System.out.println("Queue value is "+queue);

        System.out.println("Queue size is "+queue.size());
    }


    public static void priorityQueue(){
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(9);

        System.out.println("Priority Queue is " + priorityQueue);


        priorityQueue.remove();
        System.out.println("Priority after remove is " + priorityQueue);

        System.out.println("Priority after remove is " + priorityQueue.poll());

        System.out.println("Priority queue is " + priorityQueue);

        Iterator iterator = priorityQueue.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        for(Integer value: priorityQueue){
            System.out.println(value);
        }


    }
}
