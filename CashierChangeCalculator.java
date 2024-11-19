import java.util.Scanner;

public class CashierChangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Amount to be paid (in taka)
        System.out.print("Enter the amount to be paid (in taka): ");
        int amountToBePaid = scanner.nextInt();

        // Input: Amount given by the customer (in taka)
        System.out.print("Enter the amount given by the customer (in taka): ");
        int amountGivenByCustomer = scanner.nextInt();

        // Calculate the change
        int change = amountGivenByCustomer - amountToBePaid;

        if (change > 0) {
            System.out.println("Change to be returned: " + change + " taka");
            // You can further break down the change into notes and coins if needed
        } else if (change < 0) {
            // Customer paid less than the amount to be paid
            System.out.println("Amount owed by the customer: " + (-change) + " taka");
        } else {
            // Customer paid the exact amount
            System.out.println("No change needed. Exact amount received.");
        }

        scanner.close();
    }
}