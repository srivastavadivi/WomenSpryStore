public class FindTwoOddAppearances {
    public static void oddAppear(int arr[], int n){
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count%2 != 0) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    //Efficient Approach
    public static void oddAppearing(int arr[], int n){
        int xor = 0, res1 = 0, res2 = 0;
    }
}
