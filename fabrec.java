public class fabrec {
    public static void main(String args[]){
        int a=0;
        int b=1;
        int n = 8;
        fabrec1(a,b,n-2);
    }
    public static void fabrec1(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(c+" ");
      fabrec1(b,c,n-1);
     
    }
}
