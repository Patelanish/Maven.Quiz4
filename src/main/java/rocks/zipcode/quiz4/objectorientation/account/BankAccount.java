package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount implements Transactable {
    public void setBalance(Double val) {
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {

    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
       // return getBalance(amountToDecreaseBy);

    }

    @Override
    public Double getBalance() {
        return null;
    }
}
