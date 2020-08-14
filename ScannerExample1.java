/**
 * This program works as expected.
 * 
 * @author Prof. White
 * @version Fall 2020
 */
import java.util.Scanner;

public class ScannerExample1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double doubleInput;
        int intInput; 
        String stringInput;
        
        System.out.println("Enter your name:  ");
        stringInput = sc.nextLine();
        
        System.out.println("\nEnter a floating point number:  ");
        doubleInput = sc.nextDouble();
        
        System.out.println("\nEnter an integer:  ");
        intInput = sc.nextInt();
        
        System.out.println("\nValues input:  " + doubleInput + " " + intInput + " " + stringInput);
        
    }
}
