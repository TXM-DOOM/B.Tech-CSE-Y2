public class BankAccount {
    private String accountNumber;
    private String accountOwnerName;
    private String accountOwnerEmail;
    private double totalBalance;
    private int accountOwnerAge;

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
    }

    public void deposit(double amount) {
        this.totalBalance += amount;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwnerName() {
        return this.accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public String getAccountOwnerEmail() {
        return this.accountOwnerEmail;
    }

    public void setAccountOwnerEmail(String accountOwnerEmail) {
        this.accountOwnerEmail = accountOwnerEmail;
    }

    public double getTotalBalance() {
        return this.totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public int getAccountOwnerAge() {
        return this.accountOwnerAge;
    }

    public void setAccountOwnerAge(int accountOwnerAge) {
        this.accountOwnerAge = accountOwnerAge;
    }
}
