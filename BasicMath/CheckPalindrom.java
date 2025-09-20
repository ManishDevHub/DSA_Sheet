import java.util.*;



 public class CheckPalindrom {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number");

        int n = sc.nextInt();
        int bef = n;
        int rev = 0; 
        while (n > 0) {
            int lastdigit = n %10;
rev = (rev * 10) + lastdigit;
            n = n/ 10;
           
         
        }
           if(rev == bef){
            System.out.println("This is palindrom" );
           }else{
            System.out.println(" Not a palindrom");
           }
      
    }
}