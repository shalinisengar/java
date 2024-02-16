public class fact {
    public static void main(String args[]){
        int n=5;
        factorial(n,1);
    }
    public static void factorial(int n, int factl){
        if(n==0){
            System.out.print(factl);
            return;
        }
        factl= factl*n;
        factorial(n-1,factl);
    }
}
