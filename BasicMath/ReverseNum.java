import java.util.*;
public class ReverseNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");
        int n = sc.nextInt();
        while (n >0) {

             int lastDigitRenNum = n % 10;
              n = n/10;
              System.out.print(lastDigitRenNum);
         }
    
        // reverse the num if num contain 0 not inclu and revese =>
         // Example  10400 output 401

//          int rev = 0;
//     while (n >0) {

//                int ld = n % 10;
    
//                rev = (rev*10) + ld;
            
//                          n = n/10;
                         
//          }
//   System.out.print(rev);
    }
}
