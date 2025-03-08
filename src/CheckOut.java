import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double itemPrice = 0.0;
        double totalPrice = 0.0;
        boolean moreItems = true;

        do
        {
            itemPrice = SafeInput.getRangedDouble(input, "Please enter the item price", .50, 10.00);
            totalPrice += itemPrice;
            moreItems = SafeInput.getYesNoConfirm(input, "Are there more items to add");
        }
        while(moreItems);
        System.out.printf("The total price of your items is %.2f.", totalPrice);
    }
}
