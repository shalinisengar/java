public class findalind {
    public static void main(String args[]){
        int arr[] = {5,3,6,4,3,6,3,5,9,};
        int ele = 3;
        int[] ans = findallind(arr,ele,0,0);
        for(int e:ans) System.out.print(e+" ");


    }
    public static int[] findallind(int[] arr,int ele,int idx, int s){
        if(arr.length==idx){
            int[] ans =new int[s];
            return ans;
        }
        int[] a;
        if(arr[idx] == ele){
            a = findallind(arr,ele,idx+1,s+1);
        }
        else{
             a = findallind(arr,ele,idx+1,s);
        }
        if(arr[idx]==ele){
            a[s] = idx;
        }
        return a;
    }
}
