package lec_6;

import java.util.Scanner;

public class tree  {
    public class Node {
        int data;
        Node left;
        Node right;
    }
    Scanner sc = new Scanner(System.in);
    private Node root;
    public tree(){
        this.root= createTree();
    }
    private Node createTree(){
        int data =sc.nextInt();
        Node n = new Node();
        n.data = data;
        if(sc.nextBoolean()){
            n.left= createTree();
        }
        if(sc.nextBoolean()){
            n.right = createTree();
        }
        return n;
    }
    public void display(){
        displayTree(this.root);
    }

    private void displayTree(Node root){
        if(root == null){
            return;
        }
        String s = "<--"+root.data+"-->";
        if(root.left!= null){
            s = root.left.data+s;
        }
        else{
            s = "."+s;
        }
        if(root.right!= null){
            s = s+root.right.data ;
        }
        else{
            s =s+ ".";
        }
        System.out.println(s);
        displayTree(root.left);
        displayTree(root.right);
    }

   public int max1(Node root){
    if(root == null){
    return Integer.MIN_VALUE;
    }
     int left = max1(root.left);
     int right = max1(root.right);
    return Math.max(root.data, Math.max(left,right));
   }

   public  boolean find(Node root , int x){
    if(root == null)return false;
    if(root.data == x)return true;
    return find(root.left,x) || find(root.right, x);

   }
}
