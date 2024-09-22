import java.util.Scanner;

public class FinanceManager {
    private User currentUser;

    public void login(String username) {
        currentUser = new User(username);
    }

    public void addIncome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter income source: ");
        String source = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        currentUser.addIncome(source, amount);
    }

    public void addExpense() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter expense category: ");
        String category = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter note: ");
        String note = scanner.next();
        currentUser.addExpense(category, amount, note);
    }

    public void showSummary() {
        System.out.println("Total Income: " + currentUser.getTotalIncome());
        System.out.println("Total Expenses: " + currentUser.getTotalExpenses());
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
