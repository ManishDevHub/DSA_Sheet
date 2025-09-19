import java.util.*;

public class CollClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
         list.add(43);
          list.add(14);
           list.add(434);
            list.add(43);
             list.add(56);
            //  System.out.println(Collections.min(list));
            //  System.out.println(Collections.max(list));
            //  System.out.println(Collections.frequency(list,43));
            //  Collections.sort(list);
             Collections.sort(list, Comparator.reverseOrder());
             System.out.println(list);


    }
}
