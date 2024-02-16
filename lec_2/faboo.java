package lec_2;

import java.util.Stack;

public class faboo {
    public static void main(String[] args) {
        Stack <Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
       reverse(st);
       
    }
public static void reverse(Stack <Integer> st ){
if(st.isEmpty())return ;

int x= st.pop();
System.out.println(x);
reverse(st);
dounpush(x,st);
System.out.println(st);
}
 public static void dounpush(int x,Stack <Integer> st){
    if(st.isEmpty()) st.push(x);

    int y = st.pop();
    dounpush(x, st);
    st.push(y);
 }

    // public static int  fabo(int n){
    //     if(n==0|| n ==1)return n;
    //    int x = fabo(n-2);
    //    int y = fabo(n-1);
    //    return x+y;
    // }
}

