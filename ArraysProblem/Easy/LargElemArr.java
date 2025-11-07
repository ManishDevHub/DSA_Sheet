import java.util.*;

public  class LargElemArr {

    public static void main(String[] args) {
        int arr [] = { 3 ,5 ,7,11,23};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
     for(int i = 0; i <= arr.length-1; i++){
        if(arr[i] < min){
            min = arr[i];
        } else if (arr[i] > max) {
            max = arr[i];
            
        }
      
     }
       System.out.println("Largest Element " + max );
        System.out.print("Min Element " + min );

    }
    
}