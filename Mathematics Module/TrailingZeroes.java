public class TrailingZeroes {
    public static int countTrailingZeroes(int n){
        int result = 0;
        for (int i = 5; i <=n; i=i*5) {
            result = result + n/i;
        }
        return result;
    }
}
