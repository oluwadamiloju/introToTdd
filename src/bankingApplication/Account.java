package bankingApplication;

public class Account {
    double balance;
    private int pin;

    public void depositMoney(double amount) {
        if(amount >= 0) {
            balance += amount;
        }
    }

    public double getAccountBalance() {
        return balance;
    }

    public void setPin(int myPin) {
        pin = myPin;
    }

    public void withdrawMoney(double amountToWithdraw, int pin) {
        if(pin == this.pin){
            balance -= amountToWithdraw;
        }
    }
}
