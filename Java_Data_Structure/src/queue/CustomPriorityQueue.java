package queue;

import java.util.PriorityQueue;

public class CustomPriorityQueue {
    public static void main(String... args){
        PriorityQueue<Task> tasks = new PriorityQueue<>((a,b) -> a.rank - b.rank);
        tasks.add(new Task("Five", 5));
        tasks.add(new Task("Nine",9));
        tasks.add(new Task("One", 1));
        tasks.forEach(t -> System.out.println(t.description + "  " + t.rank));
        System.out.println(tasks.toArray());
    }

    public static class Task{
        String description;
        Integer rank;
        public Task(String description, Integer rank){
            this.description = description;
            this.rank = rank;
        }
    }
}
