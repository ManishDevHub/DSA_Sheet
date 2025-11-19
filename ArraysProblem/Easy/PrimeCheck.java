import java.util.*;

public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n <= 1) return false;

        // check divisibility from 2 to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();   // now taking input dynamically

        boolean result = isPrime(n);

        if (result) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is Not Prime");
        }
    }
}


