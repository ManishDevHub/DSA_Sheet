package LearnMap;
import java.util.*;

 

public class LearnMap {
    public static void main(String[] args) {
        
        // this is use to store key, value paire
        // Map<String, Integer> map = new HashMap<>();

        // map.put("One", 1);
        // map.put("Two", 2);
        // map.put("Three", 3);

        // map.put("Four", 4);
        // System.out.println(map);

        // // trivalsal in map use for each loop

        // for( Map.Entry<String, Integer> e: map.entrySet()){
        //     System.out.println(e);
        //     System.out.println(e.getKey());
        //     System.err.println(e.getValue());
        // }


        // TreeMap =>
// key ko alfaBet order me sort karta hae

          Map<String, Integer> map = new TreeMap<>();

        map.put("a", 1);
        map.put("b", 2);
        map.put("f", 3);

        map.put("c", 4);
        map.remove("f");
        System.out.println(map);



            
        


    }
}
