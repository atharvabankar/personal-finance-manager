import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceManager manager = new FinanceManager();

        System.out.print("Enter username to login: ");
        String username = scanner.nextLine();
        manager.login(username);

        while (true) {
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Show Summary");
            System.out.println("4. Save Data");
            System.out.println("5. Load Data");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manager.addIncome();
                    break;
                case 2:
                    manager.addExpense();
                    break;
                case 3:
                    manager.showSummary();
                    break;
                case 4:
                    FileHandler.saveData(manager.getCurrentUser());
                    break;
                case 5:
                    manager.login(username);
                    User loadedUser = FileHandler.loadData(username);
                    System.out.println("Data loaded for " + loadedUser.getUsername());
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
