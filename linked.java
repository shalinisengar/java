class Node{
        int val;
        Node next;
        Node(int v){
            val=v;
        }
    }
class MyLinkedList{
        Node head;
        int s;
        MyLinkedList(){
            head = null;
            s = 0;
        }
        public void display(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public void add(int v){
            Node n = new Node(v);
            if(s==0){
                head = n;
            }
            else{
                n.next = head;
                head = n;
            }
            s++;
        }
       

        }
public class linked{
    
    
 public static void main(String args[]){
            MyLinkedList ll = new MyLinkedList();
            ll.add(10);
            ll.add( 20);
            ll.display();
            ll.add(30);
            ll.add(40);
            ll.add(50);
        

    }
   

    }
