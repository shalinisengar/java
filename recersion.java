public class recersion {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6,7};
       
    rec(arr,0);

    }
    public static void rec(int arr[],int i){
        if(i == arr.length){
            return;
        }rec(arr,i+1);
        System.out.print(arr[i] +" ");
        
    }
}
