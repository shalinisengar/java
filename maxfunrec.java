public class maxfunrec {
    public static void main(String args[]){
        int arr[] = {20,52,12,59,15};
        
    int maxvalue =    maxfun(arr ,0);
    System.out.println(maxvalue);
    }
    public static int  maxfun(int arr[] , int idx){
        if(idx == arr.length){
            return Integer.MIN_VALUE;
        }
        int val = maxfun(arr , idx+1);
        
        if(arr[idx]>val){
            return arr[idx];
        }else{
            return val;
        }
    
    }
}
