import java.util.Scanner;

/**
 * Write a description of class AushadiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadiPasal
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Medicine name");
        String name=sc.nextLine();
        System.out.println("Enter Medicine Price");
        double price=sc.nextDouble();
        System.out.println("Enter Medicine Quantity");
        int amt=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Medicine name");
        String name1=sc.nextLine();
        System.out.println("Enter Medicine Price");
        double price1=sc.nextDouble();
        System.out.println("Enter Medicine Quantity");
        int amt1=sc.nextInt();
        
        System.out.println("|    Medicine    |   Price  |   Quantity   |");
        System.out.println("|   "+name+"    |   "+price+"   |   "+amt+" |   "); 
        System.out.println("|   "+name1+"    |   "+price1+"   |   "+amt1+" |   "); 
    }
}