package rocks.zipcode.quiz4.objectorientation.account;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    LinkedList<BankAccount> bankList = new LinkedList<>();
    public boolean removeBankAccountByIndex(Integer indexNumber) {
        return bankList.remove(indexNumber);
    }

    public void addBankAccount(BankAccount bankAccount) {
        bankList.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return bankList.contains(bankAccount);
    }
}
