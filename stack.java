//package fsd2.recursion.Stack;
import java.util.*;
public class stack{
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(10);
         st.push(30);
          st.push(20);
           st.push(10);
           System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
    }
}
