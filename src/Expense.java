public class Expense {
    private String note;
    private double amount;

    public Expense(String note, double amount) {
        this.note = note;
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public double getAmount() {
        return amount;
    }
}
