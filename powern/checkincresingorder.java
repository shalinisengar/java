public class checkincresingorder {
    public static void main (String atgs[]){
        int arr[]= {1,4,6,6,7,8};
       if(rec(arr,0)){
        System.out.println("true");
       }
       else {
       System.out.println("false");
       }
    
    }
    public static boolean rec(int arr[], int i){
        if(arr.length-1 == i){
            return true;
        }
        if(!rec(arr, i+1)){
            return false;
        }
        return arr[i]<=arr[i+1];
    }

}
