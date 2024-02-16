public class Main
{
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        int ans = power(x,n);
        System.out.println(ans);
    }


	public static int power(int x, int n){
	   if(n==0){
	       return 1;
	   }
	  int a = power(x,n-1);//faith
	   int fun = a*x;
	   return fun;
	}
	
}
