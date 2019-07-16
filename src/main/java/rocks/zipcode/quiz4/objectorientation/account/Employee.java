package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee extends BankAccount implements Worker {
    BankAccount bankaccount;
    Double hoursWorked;
    Double hourlyWage;
    Double moneyEarned;

    public Employee() {
        this.bankaccount = new BankAccount();
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.moneyEarned = 0.0;
    }
    public Employee(BankAccount bankaccount){
        this.bankaccount = bankaccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.moneyEarned = 0.0;
    }

    public void deposit(Double amt){
        bankaccount.deposit(amt);
    }

    public Employee(Double bal) {
        this.bankaccount = new BankAccount(bal);
    }

    public BankAccount getBankAccount() {
        return this.bankaccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankaccount = bankAccount;
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return moneyEarned;
    }


}
