public class HCF {
    public static int findHCF(int a, int b){
        int result = Math.min(a, b);
        while (result>0) {
            if (a%result == 0 && b%result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    //Euclidian Algorithm
    public static int gcd(int a, int b){
        while (a!=b) {
            if (a>b) {
                a = a-b;
            }else{
                b = b-a;
            }
        }
        return a;
    }


//Optimization of Euclidian Algorithm
public static int optimizedgcd(int a, int b){
    if (b==0) {
        return a;
    }else{
        return optimizedgcd(a, a%b);
    }
}
}
