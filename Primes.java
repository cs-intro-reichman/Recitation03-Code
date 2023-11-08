// Question 4
public class Primes {
    public static void main (String[] args){
        int max = Integer.parseInt(args[0]);
        System.out.print(max + " = ");
        
        // for each number up to max check if its prime, if so check 
        // how many times it divides by max
        // and print it the required amount of times.
        for (int i = 2; i <= max; i++){
            if (isPrime(i)){
                while (max % i == 0){
                    max = max / i;
                    if (max != 1){
                        System.out.print(i + "*");
                    } else {
                        System.out.print(i);
                    }
                }
            }
        }
        System.out.println();
    }
    
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
    
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
