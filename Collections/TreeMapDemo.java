package Collections;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String args[]){
        TreeMap<Integer, String> treeMap=new TreeMap<>();

        treeMap.put(3,"B");
        treeMap.put(2,"A");
        treeMap.put(1,"B");

        System.out.println(treeMap);
    }
}
