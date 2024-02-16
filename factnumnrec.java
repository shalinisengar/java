public class factnumnrec {
    public static void main(String args[]){
        int n=5;
       int ans = factorial(n);
       System.out.print(ans);

    }
    public static int factorial(int n){
        if(n==1||n==0){
            return 1;
        }
    int val =  factorial(n-1);
    int ans =n*val;
    return ans;
    }
}
