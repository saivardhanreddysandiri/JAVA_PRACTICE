package Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String args[]){
        Set<String> hashSet=new HashSet<>(10);
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("c");
        hashSet.add("C");
        System.out.println(hashSet);
        hashSet.remove("C");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("C"));
        for(String i:hashSet){
            System.out.print(i+" ");
        }
    }
}
