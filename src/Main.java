import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager(100);

        while (true) {
            System.out.println("\n--- Expense Tracker ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expense");
            System.out.println("3. Highest Expense");
            System.out.println("4. Lowest Expense");
            System.out.println("5. View All Expenses");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter note: ");
                    String note = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    manager.addExpense(new Expense(note, amt));
                    break;

                case 2:
                    System.out.println("Total Expense: ₹" + manager.getTotal());
                    break;

                case 3:
                    System.out.println("Highest Expense: ₹" + manager.getHighest());
                    break;

                case 4:
                    System.out.println("Lowest Expense: ₹" + manager.getLowest());
                    break;

                case 5:
                    manager.showAll();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
