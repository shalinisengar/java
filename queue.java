import java.util.*;
public class queue {
    public static void main(String args[]){
    Queue<Integer> q = new LinkedList<>();
    q.add(35);
    q.add(34);
    q.add(36);
    q.offer(89);
    System.out.println(q);
    System.out.println(q.peek());
    q.remove(34);
    System.out.println(q);
    System.out.println(q.size());
        System.out.println(q.isEmpty());
for(int ele : q){
    System.out.print(ele +" ");
}

}
}
