import java.util.*;

public class SecondLar {

    public static void main( String args []){
        int arr [] = {3 , 5,4 ,5 ,3,6,54,64,};

        int lar = 0;
        int SecLar = 0;

        for (int i = 0; i <= arr.length-1; i++){
            if(arr[i] > lar){
                SecLar = lar;
                lar = arr[i];
                

            }
          
        }
          System.out.println("Second larElem " + SecLar +" " + lar);
    }
}