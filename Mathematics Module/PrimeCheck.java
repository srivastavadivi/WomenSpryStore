public class PrimeCheck {
    
    //naive method
    public static boolean isPrime(int n){
        if (n==1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    //efficient method
    public static boolean checkPrime(int n){
        if (n==1) {
            return false;
        }
        for (int i = 2; i*i < n; i++) {
            if (n%i == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    //more efficient method
    public static boolean checkForPrime(int n){
        if (n==1) {
            return false;
        }
        if (n%2==0 || n%3==0) {
            return false;
        }

        for (int i = 5; i*i < n; i+=6) {
            if (n%i == 0 || n%(i+2) == 0) {
                return false;
            }
            return true;
        }
        return true;
    }
}
