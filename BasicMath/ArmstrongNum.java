
import java.util.*;
public class ArmstrongNum {

    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int n = sc.nextInt();
        int bef = n;
        int sum = 0;
        while (n > 0) {
            int lastdigit = n %10;
sum = sum + (lastdigit*lastdigit*lastdigit);
            n = n/ 10;
           
         
        }
           if(sum == bef){
            System.out.println("This is ArmstrongeNum" );
           }else{
            System.out.println(" Not a ArmstrongeNum");
           }
    }
}