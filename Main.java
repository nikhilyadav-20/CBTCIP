public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Banky Bank");

        // Adding accounts
        bank.addAccount("001", "Alice", 1000);
        bank.addAccount("002", "Bob", 500);

        // Depositing and Withdrawing
        bank.deposit("001", 500);
        bank.withdraw("002", 200);

        // Transferring funds
        bank.transfer("001", "002", 300);

        // Displaying account info
        bank.displayAccount("001");
        bank.displayAccount("002");
        bank.displayAccount("003"); // Non-existent account

        // Testing transfer with insufficient funds
        bank.transfer("002", "001", 1000);
    }
}
