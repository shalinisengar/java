// import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class heap {
    public static void main(String args[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(34);
         pq.add(32);
         pq.add(44);
          pq.add(41);
           pq.add(12);
           while(pq.size()>0){
            int rem = pq.remove();
            System.out.print(rem + " ");
           }
         PriorityQueue<Integer> pq1 = new PriorityQueue<>(Collections.reverseOrder());
                 pq.add(10);
        pq1.add(34);
         pq1.add(32);
         pq1.add(44);
          pq1.add(41);
           pq1.add(12);
         System.out.println(pq1);
        // System.out.println(pq);
        // pq.remove();
        // System.out.println(pq);
    }
}
