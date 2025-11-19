import java.util.Scanner;

/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main(String[] args){
        System.out.println("Enter your name");
        Scanner name= new Scanner(System.in);
        String SNam=name.nextLine();
        System.out.println("Enter your age");
        int age = name.nextInt();
        System.out.println("Enter your GPA");
        double GPA = name.nextDouble();
        System.out.println("Name is");
        System.out.println(SNam);
        System.out.println("Age is");
        System.out.println(age);
        System.out.println("GPA is");
        System.out.println(GPA);
    }
}