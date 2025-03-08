import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        String minuteString = "";

        birthYear = SafeInput.getRangedInt(input, "Please enter the year you were born", 1900, 2025);
        birthMonth = SafeInput.getRangedInt(input, "Please enter the month you were born", 1, 12);
        switch(birthMonth)
            {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    birthDay = SafeInput.getRangedInt(input, "Please enter the day you were born", 1, 31);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    birthDay = SafeInput.getRangedInt(input, "Please enter the day you were born", 1, 30);
                    break;
                case 2:
                    if(birthYear % 4 == 0 && birthYear % 100 != 0)
                    {
                        birthDay = SafeInput.getRangedInt(input, "Please enter the day you were born", 1, 29);
                    }
                    else if(birthYear % 100 == 0)
                    {
                        birthDay = SafeInput.getRangedInt(input, "Please enter the day you were born", 1, 28);
                    }
                    else
                    {
                        birthDay = SafeInput.getRangedInt(input, "Please enter the day you were born", 1, 28);
                    }
                    break;
            }
        birthHour = SafeInput.getRangedInt(input, "Please enter the hour you were born in 24 hour time", 0, 23);
        birthMinute = SafeInput.getRangedInt(input, "Please enter the minute you were born", 0, 59);
        System.out.printf("You said you were born at %d:%02d, on %d/%2d/%d.", birthHour, birthMinute, birthMonth, birthDay, birthYear);
    }
}
