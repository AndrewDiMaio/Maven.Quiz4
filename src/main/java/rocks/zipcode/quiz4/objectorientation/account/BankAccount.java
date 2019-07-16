package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private Double bal = 0.0;

    public BankAccount(Double bal) {
        this.bal = bal;
    }

    public BankAccount() {
    }

    public void setBalance(Double val) {
        this.bal = val;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        try {
            if (amountToIncreaseBy < 0) {
                bal += amountToIncreaseBy;
                throw new IllegalArgumentException();
            } else {
                bal += amountToIncreaseBy;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        bal = bal-amountToDecreaseBy;
    }

    @Override
    public Double getBalance() {
        return bal;
    }
}
