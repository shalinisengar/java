
public class power2
{
    public static void main(String args[]){
        int x = 2;
        int n = 9;
        int ans = power(x,n);
        System.out.println(ans);
    }


	public static int power(int x, int n){
	   if(n==0){
	       return 1;
	   }
	  int a = power(x,n/2);//faith
	   int fun = a*a;
	   if(n%2==1){
	       fun = fun*x;
	   }
	   return fun;
	}
	
}
