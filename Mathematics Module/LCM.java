public class LCM {
    
    //naive approach
    public static int lcm(int a, int b){
        int result = Math.max(a, b);
        while (true) {
            if (result%a == 0 && result%b == 0) {
                return result;
            }
            result++;
            return result;
        }
    }

    //efficient approach
    public static int Gcd(int a, int b){
        if (b==0) {
            return a;
        }
        return Gcd(b, a%b);
    }
    public static int Lcm(int a, int b){
        return (a*b)/Gcd(a, b);
    }
}
