public class CheckKthBit {
    //method 1--> Left shift
    public boolean kthBit(int n, int k){
        if((n&(1<<(k-1)))!=0){
            return true;
        }else{
            return false;
        }
    }
    //Method 2--> Right Shift
    public boolean checkKthBit(int n, int k){
       if(((n>>(k-1))&1)==1){
        return true;
       }else{
        return false;
       }
    }
}
