import java.util.HashMap;
import java.util.Map;

public class Bank {
    private String bankName;
    private Map<String, Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new HashMap<>();
    }

    public void addAccount(String accountNumber, String customerName, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            Account account = new Account(accountNumber, customerName, initialBalance);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account number already exists. Failed to create account.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
        } else {
            System.out.println("Account not found. Deposit failed.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.withdraw(amount);
        } else {
            System.out.println("Account not found. Withdrawal failed.");
        }
    }

    public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
        if (accounts.containsKey(fromAccountNumber) && accounts.containsKey(toAccountNumber)) {
            Account fromAccount = accounts.get(fromAccountNumber);
            Account toAccount = accounts.get(toAccountNumber);
            fromAccount.transfer(toAccount, amount);
        } else {
            System.out.println("One or both accounts not found. Transfer failed.");
        }
    }

    public void displayAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.display();
        } else {
            System.out.println("Account not found.");
        }
    }
}
