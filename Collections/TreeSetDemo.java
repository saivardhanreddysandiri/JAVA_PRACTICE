package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        Set<String> treeSet=new TreeSet<>();
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("A");
        System.out.println(treeSet);
    }
}
