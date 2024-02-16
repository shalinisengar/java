public class movexend {
    public static void main(String args[]){
        String str= "shaxxlixnxi";
       String newstr=  rec(str,0,0);
        System.out.println(newstr);
    }
    public static String rec(String str, int i,int count){
        if(str.length() == i){
            return addx(count);
        }
    char ch = str.charAt(i);
if(ch == 'x'){
 return rec(str,i+1,count+1);
}  else{
   String str1 = rec(str,i+1,count);
   return (ch + str1);
}
 }
 public static String addx(int count){
    String newstr = "x";
    for(int i =0;i<count;i++){
 newstr = newstr+'x';
    }
    return newstr;
 }

}
