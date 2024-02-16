/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class 2
{
    public static void main(String args[]){
        int x = 2;
        int n = 11;
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
