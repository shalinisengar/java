// import java.util.*;
// import java.util.Scanner;

// public class graph {
//     /**
//      * @param args
//      */
//     public static void main(String args[]){
//         try (Scanner sc = new Scanner(System.in)) {
//             int vited = sc.nextInt();
//             final ArrayList<Integer> graph[] = new ArrayList[vited];

//             for(int i =0;i<vited;i++){
//                 graph[i] = new ArrayList<>();
//             }
//             int edge = sc.nextInt();
//             for(int i = 0;i<edge;i++){
//                 int u = sc.nextInt();
//                 int v = sc.nextInt();
//                 graph[u].add(v);
//                 graph[v].add(u);
//             }
//             for(int i=0;i<vited;i++){
//                 System.out.print(i+"-> ");
//                 ArrayList<Integer> rbr = graph[i];
//                 for(int j = 0 ; j<rbr.size();j++){
//                     System.out.print(rbr.get(j)+ " ");
//                 }
//                 System.out.println();
//             }
//             // System.out.println(graph);
//         }
//     }
// }
