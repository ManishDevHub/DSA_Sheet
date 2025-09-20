import java.util.*;

public class CountDigit {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int n = sc.nextInt();
// int count = 0;
//         while (n >0) {

             
//              count = count+1;
//               n = n/10;
           
//          }
//          System.out.println();
//       System.out.print(count);


//Another way to find digitCount

  int count = (int)(Math.log10(n) + 1);
        System.out.println(count);
    }
    
}
