
public class CountSetBits {
    public static int countSet(int n){
        int res = 0;
        while (n>0) {
            if ((n&1) == 1) {
                res++;
            }
            n = n>>1;
        }
        return res;
    }

    //Brian Kerningam's Algorithm
    public static int countSet(int n, int k){
        int res = 0;
        while (n>0) {
            n = n&(n-1);
            res++;
        }
        return res;
    }

}
