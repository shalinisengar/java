public class fabo {
    public static void main(String args[]){
        int sum =0;
      for(int i = 2;i<=100;i++){
        int COUNT  =0;
        for(int j = 1;j<=i;j++){
            if(i%j == 0){
                COUNT= COUNT+1;
            }
        }

        if(COUNT ==2){
            sum = sum+i;
            System.out.print(i+" ");
        }
 
      }
      System.out.println(sum);
    }

}
