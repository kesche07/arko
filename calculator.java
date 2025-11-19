import java.util.Scanner;

/**
 * Write a description of class calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class calculator
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first Number");
        int num1=sc.nextInt();
        System.out.println("enter the second number");
        int num2=sc.nextInt();
        System.out.println("First number is:"+num1);
        System.out.println("Second number is:"+num2);
        
    }
}