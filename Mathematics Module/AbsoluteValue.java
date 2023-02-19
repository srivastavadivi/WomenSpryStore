class AbsoluteValue{
    static void findAbsolute(int n){
        if (n<0) {
            n = (-1)*n;
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n = -12;
        findAbsolute(n);
    }
}