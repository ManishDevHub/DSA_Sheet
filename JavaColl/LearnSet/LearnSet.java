import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        // it will return uniqe elements

        // Set<Integer> set = new HashSet<>();
        // set.add(21);
        //   set.add(57);
        //   set.add(57);
        //     set.add(24);
        //       set.add(41);
        //         set.add(72);
        //         set.remove(24);
        //        System.out.println(set.contains(3241)); 
        //        // check set is empty or not 
        //        System.out.println(set.isEmpty());

        //        // check size
        //        System.out.println(set.size());

        //        // clear your set 
        //        set.clear();
        //         System.out.println(set);



        //LinkedHashSet  =>

        //    Set<Integer> set = new LinkedHashSet<>();
        // set.add(21);
        //   set.add(57);
        //   set.add(57);
        //     set.add(24);
        //       set.add(41);
        //         set.add(72);
        //         set.remove(24);
        //        System.out.println(set.contains(3241)); 
        //        // check set is empty or not 
        //        System.out.println(set.isEmpty());

        //        // check size
        //        System.out.println(set.size());

        //        // clear your set 
        //     //    set.clear();
        //         System.out.println(set);


         // TreeSet => 

         // ye element ko sort order me return karta hae

         Set<Integer> ts = new TreeSet<>();
         ts.add(21);
           ts.add(57);
           ts.add(57);
           ts.add(24);
              ts.add(41);
                ts.add(72);
                System.out.println(ts);
     }
}
