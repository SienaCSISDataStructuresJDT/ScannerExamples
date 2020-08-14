import java.util.Scanner;

/**
 * Example:  Write a program to take as input the name of two teams and their 
 * respective scores and outputs the winner or tie.  Input is on one line as
 * Union 2 RPI 1
 * 
 * The program should continue this behavior until there is no more input.  
 * When there is no more input, the user should enter DONE.
 * 
 * @author Prof. White
 * @version Spring 2018
 */
public class ScannerExampleWithNext
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String team1, team2;
        int score1, score2;

        System.out.print("Enter the teams and their respective scores or DONE to end: ");
        team1 = sc.next();

        //This loop is a sentinel loop because it terminates when a certain
        //value is entered.
        while(!team1.equalsIgnoreCase("DONE")){
            //Remember, the next() method returns a String.  So, you may need
            //to convert to the correct data type.
            score1 = Integer.parseInt(sc.next());
            team2 = sc.next();
            score2 = Integer.parseInt(sc.next());

            if (score1 > score2){
                System.out.println(team1 + " wins!");
            } else if (score2 > score1){
                System.out.println(team2 + " wins!");
            } else{
                System.out.println("Tie");
            }

            System.out.print("\nEnter the teams and their respective scores or DONE to end: ");
            team1 = sc.next();
        }
    }
}