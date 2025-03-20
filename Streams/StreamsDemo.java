package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String args[]) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        System.out.println(integerList);
//        List<Integer> squareList = new ArrayList<>();
//        for(int i:integerList){
//            int a;
//            a= i*i;
//            squareList.add(a);
//        }
//        instead of above List code we can directly use the stream code which given below
//        for converting into stream using .stream method then convert back to list.
        List<Integer> streamSquare = integerList.stream().map(x -> x * x).toList();
        System.out.println(streamSquare);

//        Set<Integer> squareSet = new HashSet<>();
//        for(int i:integerList){
//            squareSet.add(i*i);
//        }
//        System.out.println(squareSet);
//
        Set<Integer> streamSetSquare = integerList.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(streamSetSquare);

        List<String> languages = new ArrayList<>();
        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        languages.add("Basic");
        System.out.println(languages);

//        List<String> filteredList = new ArrayList<>();
//        for(String s:languages){
//            if(s.startsWith("P")){
//                filteredList.add(s);
//            }
//        }
//        System.out.println(filteredList);

        List<String> streamFilterList = languages.stream().filter(s -> s.startsWith("P")).toList();
        System.out.println(streamFilterList);

        List<String> sortedList = languages.stream().sorted().toList();
        System.out.println(sortedList);
        for(String s:languages){
            System.out.println(s);
        }
        languages.stream().forEach(s-> System.out.println(s));

    }

}

