import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder {

    public static void main(String[] args) {
       
        int[] numbers = {2, 3, 5,1,8};

        System.out.println("Prime numbers in the array are:");

       
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    
    public static boolean isPrime(int n) {
     
        if (n <= 1) {
            return false;
        }
        
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
               
                return false;
            }
        }
        
        
        return true;
    }
}