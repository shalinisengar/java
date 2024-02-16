public class print_num {
    public static void main(String args[]){
        int n= 5;
        recersion1(n);
    }
    public static void recersion1(int n){
        if(n==0){
            return;
        }
        System.out.print(n);
        recersion1(n-1);
    }
}
