public class Factorial {
    public static void main(String [] args) {
        System.out.println("Version 1: Question 1\n");
        System.out.println(badFactorial1(1));
        System.out.println(badFactorial1(0));
        System.out.println(badFactorial1(5));
        System.out.println(badFactorial1(20));
        System.out.println(badFactorial1(-1));
        System.out.println("\nVersion 2: Question 1, Expansion 1\n"); 
        System.out.println(badFactorial2(1));
        System.out.println(badFactorial2(0));
        System.out.println(badFactorial2(5));
        System.out.println(badFactorial2(20));
        System.out.println(badFactorial2(-1));
        System.out.println("\nVersion 3: Question 1, Expansion 2\n"); 
        System.out.println(factorial(1));
        System.out.println(factorial(0));
        System.out.println(factorial(5));
        System.out.println(factorial(20));
        System.out.println(factorial(-1));
    }
    
    // Question 1
    public static int badFactorial1(int n) {
        int ans = 1;
        for (long i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    // Question 1, Expansion 1
    public static int badFactorial2(int n) {
        if (n < 0){
            return -1;
        }
        int ans = 1;
        for (long i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    
    // Question 1, Expansion 2
    public static long factorial(long n) {
        if (n < 0){
            return -1;
        }
        long ans = 1;
        for (long i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
    
}
