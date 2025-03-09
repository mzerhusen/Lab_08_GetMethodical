import java.util.Scanner;

public class CToFTableDisplay
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double tempCelsius = 0.0;
        double tempFahrenheit = 0.0;
        int startCelsius = 0;
        int endCelsius = 0;
        double rangeCelsius = 0.0;

        startCelsius = SafeInput.getInt(input, "Enter the temperature you'd like to start conversion at");
        endCelsius = SafeInput.getInt(input, "Enter the temperature you'd like to end conversion at");
        rangeCelsius = endCelsius - startCelsius;
        tempCelsius = startCelsius;

        System.out.println("Celsius \t\tFahrenheit");

        for(int x = 1; x <= rangeCelsius +1; x++)
        {
            tempFahrenheit = CtoF(tempCelsius);
            System.out.printf("%7.2f \t\t%6.2f \n", tempCelsius, tempFahrenheit);
            tempCelsius ++;
        }

    }

    public static double CtoF (double Celsius)
    {

        double tempFahrenheit;

        tempFahrenheit = (Celsius * 9/5) + 32;

        return tempFahrenheit;
    }
}


