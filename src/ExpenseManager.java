public class ExpenseManager {
    private Expense[] expenses;
    private int count = 0;

    public ExpenseManager(int size) {
        expenses = new Expense[size];
    }

    public void addExpense(Expense e) {
        if (count < expenses.length) {
            expenses[count++] = e;
        } else {
            System.out.println("Expense list is full!");
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += expenses[i].getAmount();
        }
        return total;
    }

    public double getHighest() {
        double max = expenses[0].getAmount();
        for (int i = 1; i < count; i++) {
            if (expenses[i].getAmount() > max) {
                max = expenses[i].getAmount();
            }
        }
        return max;
    }

    public double getLowest() {
        double min = expenses[0].getAmount();
        for (int i = 1; i < count; i++) {
            if (expenses[i].getAmount() < min) {
                min = expenses[i].getAmount();
            }
        }
        return min;
    }

    public void showAll() {
        System.out.println("\n--- All Expenses ---");
        for (int i = 0; i < count; i++) {
            System.out.println(expenses[i].getNote() + " - ₹" + expenses[i].getAmount());
        }
    }
}
