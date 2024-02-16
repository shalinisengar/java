public class printsumrec{
    public static void main(String  args[]){
        int n = 10;
        
        printnum(n,0);
       
    }
    public static void  printnum(int n ,int sum){
       
        if(n == 0){
          System.out.print(sum);
          return;
        }
       sum = sum+n;
        printnum(n-1,sum);
       
    }
}