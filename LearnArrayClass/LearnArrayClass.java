import java.util.*;

public class LearnArrayClass {
    public static void main(String[] args) {
        
int [] arr = { 3,5,3,6,2,1,5,6};
        int [] number = {1,2 ,3,5 ,6,7,8,9,34,343};
         int key  =6;

         // only sorted arrays me apply hoga
        int index= Arrays.binarySearch(number, key);
  // System.out.println(index);
        // sort arrays
        Arrays.sort(arr);
       for( int i : arr){
        System.out.print(" " +i);
       }
      


    }
}
