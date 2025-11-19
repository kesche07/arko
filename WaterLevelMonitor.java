import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the water level");
    int level=sc.nextInt();
    String isValid= (level>=1000)? "WARNING: Water level has reached 1000L or more!" : "Status:Normal";
    System.out.println(isValid);
}
}