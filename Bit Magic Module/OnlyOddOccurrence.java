public class OnlyOddOccurrence {
    public static void oddOccurrence(int n, int arr[]){
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count%2!=0) {
                System.out.println(arr[i]);
            }
        }
    }

    //Efficient Method
    public static int findOddOccurr(int arr[], int n){
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res^arr[i];
        }
        return res;
    }
}
