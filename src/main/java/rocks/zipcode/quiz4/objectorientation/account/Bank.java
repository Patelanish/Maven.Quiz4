package rocks.zipcode.quiz4.objectorientation.account;

import java.util.Iterator;
import java.util.List;

/**
 * @author leon on 27/12/2018.
 */
public class Bank {
    private List<BankAccount> accounts;

    public BankAccount removeBankAccountByIndex(Integer indexNumber) {
        BankAccount removeTheAccount = accounts.get(indexNumber);
        accounts.remove((int)indexNumber);
        return removeTheAccount;
    }

    public void addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
    }

    public Boolean containsBankAccount(BankAccount bankAccount) {
        return accounts.contains(bankAccount);
    }
}
