import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int favNumber = 0;
        double favDecimal = 0.0;

        favNumber = SafeInput.getInt(input, "Enter your favorite whole number");
        System.out.println("You said your favorite whole number is " + favNumber + ".");
        favDecimal = SafeInput.getDouble(input, "Enter your favorite number with a decimal");
        System.out.println("You said your other favorite number is " + favDecimal + ".");
    }
}
