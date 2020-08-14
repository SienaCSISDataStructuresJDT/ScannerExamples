import java.util.Scanner;

/**
 * Read the comments in the code to see how to read a String after an integer.
 * 
 * @author Prof. White
 * @version Fall 2020
 */
public class ScannerExample2Fixed
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double doubleInput;
        int intInput; 
        String stringInput;
        
        System.out.println("Enter a floating point number:  ");
        //reads up to the new line character, but leaves the new line character in the buffer
        doubleInput = sc.nextDouble();
        
        //skips the new line character in the buffer, reads up to the next new line character,
        //leaving it in the buffer
        System.out.println("\nEnter an integer:  ");
        intInput = sc.nextInt();
        
        //consume the new line character that is left in the buffer
        sc.nextLine();  
        
        //reads everything up to and including the next new line character
        System.out.println("\nEnter your name:  ");
        stringInput = sc.nextLine();
        
        System.out.println("\nValues input:  " + doubleInput + " " + intInput + " " + stringInput);
        
    }
}
