package lec_6;

public class Tree_Client {

    public static void main(String[] args) {
        tree  tr = new tree();
        tr.display();
        System.out.println(tr.max1(null));
        // tr.max();
        System.out.println(tr.find(null,20));

    }
}
