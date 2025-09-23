 import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        

               Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int n = sc.nextInt();
        int cnt = 0;

// time com tc = o(sqrt n);

        // for( int i= 1;  i*i<=n ;i++){
        //     if(n%1 == 0){
        //         cnt++;
        //         if(n /i != i)
        //         cnt++;
        //     }

        // }
        // if( cnt == 2){
        // System.out.println("true");
        // }else{
        //     System.out.println("false");
        // }
// time comp tc= o(n)

        for( int i=1; i<=n; i++){
            if(n % i == 0){
                cnt++;
            }
         
        } 
           if(cnt == 2){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
    }
}
