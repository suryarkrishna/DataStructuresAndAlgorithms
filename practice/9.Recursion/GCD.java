public class GCD {

    public static void main(String[] args) {
        System.out.println("gcd: "+gcd(24, 12));
    }

    private static int gcd(int i, int j) {
        if(i < 0 || j < 0){
            return -1;
        }
        if(j == 0){
            return i;
        }
        return gcd(j, i%j);
        
    }
    
}
