public class calpower {
    public static void main(String args[]){
        int n =5; 
        int x = 2 ;
      int ans =   power(x,n);
      System.out.print(ans);
    }
    public static int power(int x, int n){
        if(n ==0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int x_ = power(x, n-1);
        int xn =x*x_;
        return xn;

    }
}
