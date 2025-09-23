
import java.util.*;
public class Gcd {
    
    public static void main(String[] args) {
        
// tc = big of log fie minnimum of a and b

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1");
        int a = sc.nextInt();
        System.out.println(" Enter Num2");
        int b = sc.nextInt();

        while (a > 0 && b > 0) {
            if(a > b ){
                a = a % b;

            }else{
                b = b %a; 
            }
            
        }
        if( a == 0){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
}
