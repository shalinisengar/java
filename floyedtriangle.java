// import java.util.Scanner;

import java.util.Scanner;

public class floyedtriangle {
    public static void main(String[] args) {
        int k = 1;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number: ");
            int n = sc.nextInt();
            for(int i = 0; i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print(k+" ");
                    k++;
                }
                System.out.println();

            }
        }
    }
}
