
public class newclass
{
    int age;// instance variable
    static int agr; //static variable
    public static void main(String[] args){
    System.out.println("hello");
    int qty; //local variable
    qty=2;
    //<classname> <variable>=new <className>();
    newclass gr=new newclass();
    
    System.out.println(gr.age);
    System.out.println(agr);
    System.out.println(qty);
    
    }
}