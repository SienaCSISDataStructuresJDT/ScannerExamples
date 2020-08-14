import java.util.Scanner;

/**
 * This program used a delimiter to read all of the data on one line
 * and separate the data into its parts, removing the delimiter.
 * 
 * Input should be entered as
 * 
 * 3.5,1,White
 * 
 * There should not be any spaces in the input.
 * 
 * @author Prof. White
 * @version Fall 2020
 */
public class ScannerExampleSingleLine
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double doubleInput;
        int intInput; 
        String stringInput;
        
        System.out.println("Enter a floating point number, an integer, and your name, all separated by a comma:  ");
        
        sc.useDelimiter(",");
        doubleInput = sc.nextDouble();
        intInput = sc.nextInt();
        stringInput = sc.nextLine();
        //remove the leading comma
        stringInput = stringInput.substring(1);
        
        System.out.println("\nValues input:  " + doubleInput + " " + intInput + " " + stringInput);
        
    }
}
