//L001
//construct binary tree
import java.util.*;
class TreeNode{
  int data;
  TreeNode left;
  TreeNode right;
  TreeNode(int val){
    data = val;
  }
}
class Pair{
    TreeNode node;
    int state;
    Pair(TreeNode n , int s){
        node = n;
        state = s;
    }
}


public class tree{
    public static TreeNode constructTree(int[] arr){
       TreeNode root = new TreeNode(arr[0]);
       Stack<Pair> st = new Stack<>();
       Pair p = new Pair(root , 1);
       st.push(p);
       int i = 1;
       while(st.size() > 0){
          Pair top = st.peek();
          if(top.state == 1){
            if(arr[i++] != -1){
              TreeNode n = new TreeNode(arr[i-1]);
              top.node.left = n;
              Pair np = new Pair(n , 1);
              st.push(np);
            }
            top.state++;
          } else if (top.state == 2){
             if(arr[i++] != -1){
              TreeNode n = new TreeNode(arr[i-1]);
              top.node.right = n;
              Pair np = new Pair(n , 1);
              st.push(np);
            }
            top.state++;

          } else{
            st.pop();
          }
       }
       return root;
    }
    static String pre = "";
    static String In = "";
    static String post = "";
    public static void preOrder(TreeNode root){
        if(root == null) return;
        pre += root.data+" ";
        preOrder(root.left); //left
        In += root.data+" ";
        preOrder(root.right); //right
        post += root.data+" ";
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,-1,3,5,-1,-1,6,-1,-1};
        TreeNode root = constructTree(arr);
        preOrder(root);
       System.out.println(pre);
       System.out.println(In);
       System.out.println(post);
    }
}