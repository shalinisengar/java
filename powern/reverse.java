public class reverse {
    public static void main(String args[]){
        String str = "abcd";
      String ans=   rec(str);
      System.out.print(ans);
    }
    public static String rec(String str){
        if(str.length() == 1){
            return str;
        }
        char ch = str.charAt(0);
        String sb =  rec(str.substring(1));
        return sb+ch;
    }
}
