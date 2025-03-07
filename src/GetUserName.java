import java.util.Scanner;

public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String userName;

        userName = SafeInput.getNonZeroLenString(input, "Enter your username: ");
        System.out.println("You said your username is " + userName);
    }
}
