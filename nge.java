import java.util.Stack;

public class nge {
    public static void main(String[] args) {
        int arr[] = {9,11,23,15,38,42,37};
        Stack <Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        
        for(int i = 0; i<arr.length;i++){
            while(!st.isEmpty()&& arr[st.peek()]<arr[i]){
                    ans[st.peek()]  = arr[i];
                    st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()] = -1;
            st.pop();
        }
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
        // System.out.println(Integer.toString(ans));
    }
}
