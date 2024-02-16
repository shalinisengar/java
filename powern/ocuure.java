public class ocuure{
    public static void main(String args[]){
        int arr[] = {1,4,2,4,6,7,4,8};
        int ele = 4;
     rec(arr, 0,ele);
      
        System.out.println(last);
    }
    public static int last =-1;
   
    public static void rec(int arr[], int i,int ele){
        
        if(arr.length == i){
          return ;

        }
        if(ele == arr[i]){
         last = i;
        }
        rec(arr,i+1,ele);
       
    }
}