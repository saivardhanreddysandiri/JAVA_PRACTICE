package DataStructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]){
        Queue<String> queue=new PriorityQueue<>();
        queue.add("India");
        queue.add("England");
        queue.add("America");

        System.out.println(queue);
        //Here it prints [America, India, England] but According
        //to PriorityQueue it give Sorting as America, England, India
        //Sysout doesn't know the Sorting so gives `random fashion.

        queue.remove();
        System.out.println("Elements after removing Top "+queue);

        String topElement=queue.peek();
        System.out.println(topElement);
    }

}
