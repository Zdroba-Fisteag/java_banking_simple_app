public class Account {
    private int balance;

    public Account(int startkontostand) {
        this.balance = startkontostand;
    }

    public int deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        return this.balance;
    }

    public int withdraw(int amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Zu wenig Geld oder einfach zu viel hacken versucht.");
        }
        return this.balance;
    }

    public int getBalance() {
        return this.balance;
    }
}
