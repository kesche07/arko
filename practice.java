import java.util.Scanner;

public class practice{
    public static void main(String[] args){
        Scanner age= new Scanner(System.in);
        System.out.println("Enter First number:");
        int firstNum=age.nextInt(); 
        System.out.println(firstNum);
        String isValid= (firstNum>=18)? "Driving is allowed" : "Driving is not allowed"; //strin/int/boolean 
        System.out.println(isValid);

    }

}
