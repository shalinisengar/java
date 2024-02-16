public class sumnumrec {
    public static void main(String args[]){
        
        recersion1(5,1,0);
    }
    public static  void recersion1(int n,int i,int sum){
        if(i == n){
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        
        recersion1(n,i+1,sum);
    }
}
