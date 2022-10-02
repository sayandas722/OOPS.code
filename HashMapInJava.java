
import java.util.*;
public class HashMapInJava {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //insert
        map.put("India", 01);
        map.put("Pakistan", 02);
        map.put("England", 03);
        map.put("Austrelia", 04);
        map.put("South Africa", 05);

        System.out.println(map);

        //search
        if(map.containsKey("India")){
            System.out.println("Key Present");
        }

       // System.out.println(map.get("India"));

       //Print Key and Value using for loop
       for(Map.Entry<String,Integer> e:map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
       }

       // Remove a value from HashMap
       map.remove("Pakistan");
       System.out.println(map);
    }
}
