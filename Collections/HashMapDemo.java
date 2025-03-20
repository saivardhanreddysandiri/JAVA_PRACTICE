package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String args[]){
        Map<String, Integer> map= new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);

        System.out.println("Size of Map " +map.size());
        System.out.println(map);

        if(map.containsKey("a")){
            Integer a= map.get("a");
            System.out.println(a);
        }
        for (String key : map.keySet()){
            System.out.println(key+map.get(key));
        }
    }
}
