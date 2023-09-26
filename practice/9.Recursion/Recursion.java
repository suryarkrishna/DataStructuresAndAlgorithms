
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Learning Recursion: ");
        System.out.print("Factorial using recursion: ");
        System.out.println(fact(4));
        System.out.println("Fibonacci using recursion: "+fib(2));
        int[] arr = new int[]{11, 4, 12, 7, 56, 3};
        System.out.println("max of arr: "+ findMax(arr, arr.length));
    }

    private static int findMax(int[] arr, int n) {
        if(n == 1){
            return arr[0];
        }
        return Math.max(arr[n-1], findMax(arr, n-1));
    }

    private static int fib(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    private static int fact(int n) {   
        if ( n < 0 ) {
            return -1;
        }
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }

}
