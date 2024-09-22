import java.util.HashMap;

public class User {
    private String username;
    private HashMap<String, Income> incomes;
    private HashMap<String, Expense> expenses;

    public User(String username) {
        this.username = username;
        this.incomes = new HashMap<>();
        this.expenses = new HashMap<>();
    }

    public String getUsername() {
        return username;
    }

    public void addIncome(String source, double amount) {
        incomes.put(source, new Income(source, amount));
    }

    public void addExpense(String category, double amount, String note) {
        expenses.put(category, new Expense(category, amount, note));
    }

    public double getTotalIncome() {
        return incomes.values().stream().mapToDouble(Income::getAmount).sum();
    }

    public double getTotalExpenses() {
        return expenses.values().stream().mapToDouble(Expense::getAmount).sum();
    }

    public HashMap<String, Income> getIncomes() {
        return incomes;
    }

    public HashMap<String, Expense> getExpenses() {
        return expenses;
    }
}
