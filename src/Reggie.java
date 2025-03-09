import javax.xml.transform.Source;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String studentSSN = "";
        String studentMNumber = "";
        String userSelection = "";

        studentSSN = SafeInput.getRegExString(input, "Please enter your Social Security Number", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered " + studentSSN + " as your Social Security Number.");

        studentMNumber = SafeInput.getRegExString(input, "Please enter your UC Student M number", "^(M|m)\\d{5}$");
        System.out.println("You entered " + studentMNumber + " as your UC Student M number.");

        SafeInput.prettyHeader("Open - O   Save - S   View - V   Quit - Q");
        userSelection = SafeInput.getRegExString(input, "Please enter your selection", "[OoSsVvQq]");
        switch(userSelection)
        {
            case "O":
            case "o":
                System.out.println("You selected open.");
                break;
            case "S":
            case "s":
                System.out.println("You selected save.");
                break;
            case "V":
            case "v":
                System.out.println("You selected view.");
                break;
            case "Q":
            case "q":
                System.out.println("You selected quit.");
                break;
        }
    }
}
