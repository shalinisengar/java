public class printnum {
   
        public static void main(String args[]){
            int n= 1;
            recersion1(n);
        }
        public static void recersion1(int n){
            if(n==5){
                return;
            }
            System.out.print(n);
            recersion1(n+1);
        }
    }