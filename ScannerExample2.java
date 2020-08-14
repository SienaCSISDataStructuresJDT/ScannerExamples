import java.util.Scanner;

/**
 * The use of Scanner in this way generates an error in the way the program works due
 * newline characters being left in the buffer when reading a String after an int.
 * 
 * @author Prof. White
 * @version Fall 2020
 */
public class ScannerExample2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double doubleInput;
        int intInput; 
        String stringInput;
        
        System.out.println("Enter a floating point number:  ");
        doubleInput = sc.nextDouble();
        
        System.out.println("\nEnter an integer:  ");
        intInput = sc.nextInt();
        
        System.out.println("\nEnter your name:  ");
        stringInput = sc.nextLine();
        
        System.out.println("\nValues input:  " + doubleInput + " " + intInput + " " + stringInput);
        
    }
}
