
/**
 * Write a description of class tutorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial
{
    public static void main(String[] args){
        int age;//variable declared
        age=18;//assigned value
        int qty= 8;
        System.out.println(age);
        
        // Implicit typecasting --> Widening Casting
        int h=10;
        double k=h;
        System.out.println(k);
        
        // Implicit typecasting --> Narrowing Casting 
        short j=15;
        byte l=(byte)j;
        System.out.println(j);
        
        // exceptions in arithmetic operators
        byte st=10;
        byte sr=9;
        byte sum=(byte)(st+sr);
        System.out.println(sum);
        
        //min max size of the values
        //for byte
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.SIZE);
        System.out.println(Byte.BYTES);
        
        //Escape sequence
        System.out.println("Hello \n world");
        System.out.println("Hello \t Nepal");
        System.out.println("He said \"Hi\" "); 
        
        System.out.println("i love anuu \u2764");
        
    }
}