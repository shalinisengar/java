class person{
    String name;
    int age;
    public void great(){
        System.out.println("hiii");
    }
    
    public void walk(){
        System.out.println("i am walking....");
    }
    
}

    public class cont {
    public static void main(String args[]){
        person p1 = new person();
        p1.great();
        p1.walk();
    }
}
