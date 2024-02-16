package lec_2;

public class LinkedList {
    class Node {
        int data;
        Node next;
    
        Node() {
           this.data=0;
           this.next=null;
        };
        Node(int data){
          this.data=data;
        }
    
    }
    private Node head;
    private Node tail;
    private int size;
    public  void addFirst(int item) {
        Node nn = new Node(item);
      if(this.head == null){
        this.head=nn;
        this.tail=nn;
        size= size+1;
      }
      else{
        nn.next = this.head;
        this.head=nn;
        size= size+1;
    
      }
    }

    public void addLast( int item){
      Node n = new Node(item);
      if(this.head == null){
        tail = n;
        head = n;

      }
      else{
        tail.next = n;
        tail = n;
      }
    }

    public int getFirst(int k){
      if(head == null){
        System.out.println("linked list is empty");
        return -1;
      }
      
        return head.data;
      
    }

    public int getlast(){
      if(head == null){
        return -1;
      }
    return tail.data;

    }


    public int getanyNode(int k){
          return getNode(k).data;
    }

    
    public Node getNode(int k){
      if(k<=0 || k > length()){
        return null;
      }
     
      int x =1;
      Node temp = head;
      while (x < k) {
        temp = temp.next;
        x++;
      }
       return temp;
      
    }
   
    public int length(){
      int count = 0;
      Node t = head;
      while(t!= null){
        t = t.next;
        count++;
      }
      return count;
      
    }

    public void insertanyNode(int item , int k ){
      Node n = new Node();
      if(k<= 0){
        addFirst(item);
      }
      else if(k == length()){
        addLast(item);
      }
      
      Node t = getNode(k-1);
      if(t != null){
        n.next = t.next;
        t.next = n;
      }

    }

    public void removefirst(int k){
      if(head == null){
        System.out.println("linked list is empty");
      }
      Node temp = head;
      
      head = temp.next;
      temp.next = null;
    }

    public void removelast(int k){
      if(head != null){
        Node temp = head;
        while (temp!= null) {
          temp = temp.next;
        }
        temp = null;
      }
    }
    // public void removeanyNode(int k){

    //   Node curr = head, prev = null;
    //   while (curr != null) {
    //     Node fwd = curr.next;
    //     curr.next = prev;
    //     prev = curr;
    //     curr = fwd;
    //   }
    //   head = prev;

    // }
    
    public  void display() {
      Node temp=this.head;
      while(temp!= null){
        System.out.println(temp.data+" ");
        temp = temp.next;
      }
    }
}
