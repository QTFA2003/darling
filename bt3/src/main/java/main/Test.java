package main;

import java.util.*;

public class Test {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
//        for(int number : arr){
//            System.out.println(number);
//        }
//        List<String> person = new ArrayList<>();
//        person.add("toandz");
//        person.add("toandz");
//        person.add("toandz");
//        person.add("toandz");
//        for(String name : person){
//            System.out.println(name);
//        }
//        Map<Integer,String> person = new HashMap<>();
//        person.put(2,"toan");
//        person.put(1,"toan");
//        person.put(3,"toan");
//        person.put(4,"toan");
//
//            for(Map.Entry name : person.entrySet()){
//                System.out.println(name.getKey() + " " + name.getValue());
//            }
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}

