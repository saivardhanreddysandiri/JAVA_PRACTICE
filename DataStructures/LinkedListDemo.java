package DataStructures;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String args[]){
        List<String> linkedList=new LinkedList<>();

        linkedList.add("A");
        linkedList.addFirst("D");
        linkedList.addLast("F");
        linkedList.add(2,"C");
        System.out.println(linkedList);
        linkedList.remove("A");
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove(0);
        System.out.println(linkedList);
    }
}
