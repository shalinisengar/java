public class recerele {
    public static void main(String args[]){
        int arr[] = {5,2,5,7,5,9,0,6,7};
        int ele = 7;
        int ans = occure(arr,0,ele);
        System.out.print(ans);
    }
    public static int occure(int arr[] , int i, int ele){
        if(i== arr.length){
            return -1;
        }
        int val = occure(arr , i+1,ele);
        
        if(ele==arr[i]){
            return i;
        }else{
            return val;
    }
}
}
