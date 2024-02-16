import java.util.Stack;

public class pricestack {
    public static void main(String[] args) {
        int arr[] = { 100, 60, 70, 60, 80, 75, 85 };
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        ans[0] = 1;
        for (int i = 0; i < arr.length; i++) {
            st.push(i);
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = i + 1;
            } else {
                ans[i] = i - st.peek();
            }

            st.push(i);

        }
        for(int i =0;i<ans.length;i++){
            System.out.print(ans[i]);
        }

    }
}
