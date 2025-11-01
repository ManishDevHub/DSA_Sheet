public class demo {
    
    public static void PositiveArr(int [] arr){
        int operation = 0;
         for( int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
                operation++;
            } else if( arr[i] == -1){
                arr[i] = 1;
                operation = operation + 2;
            }
 
         }
         System.out.println(operation);
        
    }
    public static void main(String[] args) {
        int arr [] = {-1 , -1,1 , 1};
        PositiveArr(arr);
    }
}
